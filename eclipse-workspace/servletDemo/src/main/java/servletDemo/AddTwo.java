package servletDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddTwo extends HttpServlet {// here mapping the webcontainer(url)with servlet with the help of xml file
    public void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
      Integer i=	Integer.parseInt(req.getParameter("num1"));
      Integer j=	Integer.parseInt(req.getParameter("num2"));
      Integer k =i+j;
//      System.out.println(k);
      PrintWriter out =resp.getWriter();
      out.println("the sum of two numbers:"+k);
    }
}
