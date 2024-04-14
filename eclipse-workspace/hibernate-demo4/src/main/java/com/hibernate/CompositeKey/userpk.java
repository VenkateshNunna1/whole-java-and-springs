package com.hibernate.CompositeKey;

import java.io.Serializable;

public class userpk  implements Serializable{//embeddable class
    private String email;
    private String password; //in older java versions we have to add object class equals method and hashcode method in this class
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
    
}
