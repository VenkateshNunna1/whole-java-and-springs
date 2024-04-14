package com.spring.singleton;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class doctor {
  private String qualification;

public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}

@Override
public String toString() {
	return "doctor [qualification=" + qualification + "]";
}

}
