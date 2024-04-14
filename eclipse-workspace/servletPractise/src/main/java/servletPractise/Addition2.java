package servletPractise;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/addition")
public class Addition2 extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int num1 = Integer.parseInt(req.getParameter("first"));
		int num2 = Integer.parseInt(req.getParameter("seocond"));
		int c=num1+num2;
		PrintWriter pw=res.getWriter();
		pw.print(c);
	}

}
