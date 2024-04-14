package com.springs.variableInjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Battery {
@Value("1")
  int id;
 @Value("3250 mah")
  String mah;
  public void battery() {
	  System.out.println("iphones uses lithium-ion batteries");
  }
}
