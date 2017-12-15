package servlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID=1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String username=request.getParameter("username");
		System.out.println("”√ªß√˚£∫"+username);
		
		String password=request.getParameter("password");
		System.out.println("√‹¬Î£∫"+password);
		
		String[] hobbies=request.getParameterValues("hobby");
		System.out.println(Arrays.toString(hobbies));		
		
		Map<String, String[]> allData=request.getParameterMap();
		for(Map.Entry<String, String[]>entry:allData.entrySet()){
			System.out.print(entry.getKey());
			System.out.print("-->");
			System.out.println(Arrays.toString(entry.getValue()) );
		}
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			doGet(request,response);
		
	}

}
