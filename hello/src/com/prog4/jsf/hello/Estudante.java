package com.prog4.jsf.hello;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Estudante {

	private String firstName;
	private String lastName;
	private String pais;
	private String linguagemFavorita;
	private String[] linguagensFavoritas;
	
	List<String> opcoesPais;
	
	// construtor
	public Estudante() {
		
		// É possível popular o formulário inicializando as propriedades:
		firstName = "João";
		lastName = "da Silva";
		pais = "France";
		
		// preenche lista de países
		opcoesPais = new ArrayList<>();
			
		opcoesPais.add("Brasil");
		opcoesPais.add("France");
		opcoesPais.add("Germany");
		opcoesPais.add("India");
		opcoesPais.add("Turkey");
		opcoesPais.add("United Kingdom");
		opcoesPais.add("United States");
		
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

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public List<String> getOpcoesPais() {
		return opcoesPais;
	}

	public String getLinguagemFavorita() {
		return linguagemFavorita;
	}

	public void setLinguagemFavorita(String linguagemFavorita) {
		this.linguagemFavorita = linguagemFavorita;
	}

	public String[] getLinguagensFavoritas() {
		return linguagensFavoritas;
	}

	public void setLinguagensFavoritas(String[] linguagensFavoritas) {
		this.linguagensFavoritas = linguagensFavoritas;
	}

	
	
}