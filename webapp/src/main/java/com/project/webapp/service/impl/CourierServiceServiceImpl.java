package com.project.webapp.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.project.webapp.dto.response.CompanyDto;
import com.project.webapp.dto.response.CourierServiceDto;
import com.project.webapp.model.Company;
import com.project.webapp.model.CourierService;
import com.project.webapp.repository.CourierServiceRepository;
import com.project.webapp.service.CourierServiceService;
import com.project.webapp.util.WebShopException;

@Service
public class CourierServiceServiceImpl implements CourierServiceService {
	
	@Autowired
	CourierServiceRepository courierServiceRepository;
	
	@Override
	public List<CourierServiceDto> getAllCourierServices() {
		List<CourierService> courierServices = courierServiceRepository.findAll();
		List<CourierServiceDto> courierServicesDto = new ArrayList<CourierServiceDto>();
		for(CourierService courierService: courierServices) {
			courierServicesDto.add(new CourierServiceDto(courierService));
		}	
		return courierServicesDto;
	}

	@Override
	public CourierServiceDto getCountryById(int id) {
		CourierService courierService = courierServiceRepository.findById(id).orElseThrow(() -> new WebShopException(HttpStatus.BAD_REQUEST, "there is no CourierSerivice iwth ID: " + id));
		return new CourierServiceDto(courierService);
	}

	@Override
	public CourierServiceDto editCountry(int id, CourierServiceDto courierServiceDto) {
 		CourierService courierService = courierServiceRepository.findById(id).orElseThrow(() -> new WebShopException(HttpStatus.BAD_REQUEST, "there is no CourierSerivice iwth ID: " + id));
 		courierService = courierServiceRepository.saveAndFlush(courierService);
 		return new CourierServiceDto(courierService);
	}

	@Override
	public CourierServiceDto createNewCourierService(CourierServiceDto courierServiceDto) {
		CourierService courierService = new CourierService(courierServiceDto);
		courierService = courierServiceRepository.saveAndFlush(courierService);
		return new CourierServiceDto(courierService);
	}
	
	@Override
	public CourierServiceDto deleteCountryById(int id) {
		CourierService courierService = courierServiceRepository.findById(id).orElseThrow(() -> new WebShopException(HttpStatus.BAD_REQUEST, "there is no CourierSerivice iwth ID: " + id));
		courierService.setDeleted(false);
		courierServiceRepository.saveAndFlush(courierService);//istoo
		return new CourierServiceDto(courierService);
	}
	
	
	
	
	
}
