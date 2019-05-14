package com.project.webapp.dto.response;

import com.project.webapp.model.Company;

public class CompanyDto {
	private int idCompany;
	private String name;
	private String country;
	private String city;
	private String address;
	private String bankAccount;
	private boolean isDelted;

	public CompanyDto() {
	};

	public CompanyDto(Company company) {
		super();
		this.idCompany = company.getIdCompany();
		this.name = company.getName();
		this.country = company.getCountry();
		this.city = company.getCity();
		this.address = company.getAddress();
		this.bankAccount = company.getBankAccount();
	}

	public CompanyDto(int idCompany, String name, String country, String city, String address, String bankAccount) {
		super();
		this.idCompany = idCompany;
		this.name = name;
		this.country = country;
		this.city = city;
		this.address = address;
		this.bankAccount = bankAccount;
	}

	public int getIdCompany() {
		return idCompany;
	}

	public void setIdCompany(int idCompany) {
		this.idCompany = idCompany;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	public boolean isDelted() {
		return isDelted;
	}

	public void setDelted(boolean isDelted) {
		this.isDelted = isDelted;
	}

}
