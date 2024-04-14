package servletDemo;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/fetch_data")
public class FetchDataFromForm extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	 String s1= req.getParameter("col1");
	 String s2= req.getParameter("col2");
	 String s3= req.getParameter("col3");
	 String s4= req.getParameter("col");//if you pass wrong id or data,it will not give any error.it will give null value
	 System.out.println(s1);
	 System.out.println(s2);
	 System.out.println(s3);
	 System.out.println(s4);
	}

}
