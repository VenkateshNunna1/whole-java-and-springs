package com.springs.springMVC;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping("/ganesh")//map the url to the methods
    public String  m1() {
    	return "hello"; // it is a problem to mention jsp technology here beacause when the change  from one technology to another technology it is difficult to change the files/extensions
    }
}
