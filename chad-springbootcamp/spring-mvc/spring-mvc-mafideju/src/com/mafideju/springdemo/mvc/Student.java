package com.mafideju.springdemo.mvc;

import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Student {
	@NotNull(message="Not Null, Baby.")
	@Size(min=1, message="Pelo menos uma letra")
	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String, String> countryOptions;
	private String favoriteLanguage;
	private String os;
	@NotNull(message="Precisamos saber sua idade.")
	@Min(value=18, message="É necessário ser maior de idade")
	@Max(value=80, message="Tá tenso vô")
	private Integer age;
	@Pattern(regexp="^[0-9]{8}", message="Apenas os numeros")
	private String postalCode;

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
	
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	
}
