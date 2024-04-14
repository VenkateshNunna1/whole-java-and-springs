package com.springMVC;


import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
	@RequestMapping("/hii")
   public String m1() {
	   return "output.jsp";
   }
}
