package servletDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/pw")
public class PrintDataBrowser extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		 String s1= req.getParameter("col1");
		 String s2= req.getParameter("col2");
		 String s3= req.getParameter("col3");
		 PrintWriter out = res.getWriter();
		 out.print("good morning"+ s2);
		 
		
	}

}
