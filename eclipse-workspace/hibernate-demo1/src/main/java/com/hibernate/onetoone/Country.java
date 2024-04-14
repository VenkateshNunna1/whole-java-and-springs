 package com.hibernate.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Country {
	@Id
    private int id;
    private String name;
    private String capital;
    @OneToOne
    private Primeminster primeminster;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public Primeminster getPrimeminster() {
		return primeminster;
	}
	public void setPrimeminster(Primeminster primeminster) {
		this.primeminster = primeminster;
	}
    
}
