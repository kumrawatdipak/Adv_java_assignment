package package2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/Addition.cdac")
public class Addition extends HttpServlet{
	protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String a1=request.getParameter("di");
		String a2=request.getParameter("pk");
		
		int a3=Integer.parseInt(a1);
		int a4=Integer.parseInt(a2);
		int a5=  a3+a4;
		response.setContentType("text/html");
		
		PrintWriter out =response.getWriter();
		
		out.write("<html><body>");
		
		out.write("<h1>Addition is :  " + a5 +"</h1>");
		
		out.write("</body></html>");
		
	}

}
