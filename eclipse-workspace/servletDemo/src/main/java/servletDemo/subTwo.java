package servletDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/sub")//mapping webcontainer(url) with servlet with the help of annotation.
public class subTwo extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		 Integer i=	Integer.parseInt(req.getParameter("num1"));
	      Integer j=	Integer.parseInt(req.getParameter("num2"));
	      Integer k =i-j;
	      PrintWriter out =res.getWriter();
	      out.println("the sub of two numbers:"+k);
		
	}
   
}
