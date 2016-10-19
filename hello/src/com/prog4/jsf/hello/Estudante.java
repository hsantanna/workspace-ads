package com.prog4.jsf.hello;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Estudante {

	private String firstName;
	private String lastName;
	
	// construtor
	public Estudante() {
		
	}
	
	public String salvar(){
		
		return "estudante_resposta";
	}
	
	// getter/setter
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	
}