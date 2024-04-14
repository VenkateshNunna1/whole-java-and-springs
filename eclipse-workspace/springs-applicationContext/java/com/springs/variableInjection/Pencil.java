package com.springs.variableInjection;

import org.springframework.stereotype.Component;

@Component
public class Pencil {
   public void write() {
	   System.out.println("pencil is writing well");
   }
}
