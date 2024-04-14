package com.spring.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Qualification {
  private String stream;
  public double getPercentage() {
	return percentage;
}
  @Value("89")
public void setPercentage(double percentage) {
	this.percentage = percentage;
}
public char getGrade() {
	return grade;
}
@Value("A")
public void setGrade(char grade) {
	this.grade = grade;
}
public int getYop() {
	return yop;
}
@Value("2023")
public void setYop(int yop) {
	this.yop = yop;
}
private double percentage;
  private char grade;
  private int yop;
}
