package com.mafideju.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String, String> countryOptions;
	private String favoriteLanguage;
	private String os;

	public Student () {
		loadCountries();
	}
	
	public void loadCountries() {
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("DE", "Alemanha");
		countryOptions.put("IN", "India");
		countryOptions.put("BR", "Brasil");
		countryOptions.put("AR", "Argentina");
		countryOptions.put("US", "Estados Unidos");
		countryOptions.put("FR", "França");
		countryOptions.put("ES", "Espanha");
	}

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
	};
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}
	
	
}
