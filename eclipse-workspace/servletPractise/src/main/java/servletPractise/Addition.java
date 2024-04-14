package servletPractise;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/1addition")
public class Addition extends HttpServlet {
     @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	 int num1 = Integer.parseInt(req.getParameter("first"));
    	 int num2 = Integer.parseInt(req.getParameter("seocond"));
    	 int result = num1 + num2;
    	 PrintWriter pw= resp.getWriter();
    	  pw.print(result);
    }
	
	

}
