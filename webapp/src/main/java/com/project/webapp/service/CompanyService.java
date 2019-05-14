package com.project.webapp.service;

import java.util.List;

import com.project.webapp.dto.response.CompanyDto;

public interface CompanyService {

	CompanyDto getCompanyById(int id);

	CompanyDto deleteCompanyById(int id);
	
	CompanyDto editCompany(int id, CompanyDto companyDto);

	CompanyDto createNewCompany(CompanyDto companyDto);

	List<CompanyDto> listAllCompanies();


	
}
