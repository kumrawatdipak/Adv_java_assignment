package package3;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Period;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/Date")
public class Date extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String datestring=null;
	@SuppressWarnings("unused")
	int age=0;
	try {
		datestring=request.getParameter("DOB");
	}catch(Exception e) {
	}
	LocalDate date1=LocalDate.parse(datestring);
	    date1.getYear();
	LocalDate date2 = java.time.LocalDate.now();
	
	    age=date2.getYear()-date1.getYear();
	    
	    Period p=Period.between(date1, date2);
	    
	    System.out.println("years(Difference)=" + p.getYears());	 
	    System.out.println("month (Difference)=" + p.getMonths());
	    System.out.println("Days (Difference)="	+ p.getDays());    
	    
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	
	out.write("<html><body>");
	
	out.write("<h1> you are "+p.getYears()+ " Years "+p.getMonths()+"months"+p.getDays()+" days old </h1>");
	
		out.write("</body></html>");
	}

}
