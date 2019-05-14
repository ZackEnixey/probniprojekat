package com.project.webapp.service;

import java.util.List;

import com.project.webapp.dto.response.CourierServiceDto;
import com.project.webapp.model.CourierService;

public interface CourierServiceService {

	List<CourierServiceDto> getAllCourierServices();

	CourierServiceDto getCountryById(int id);

	CourierServiceDto editCountry(int id, CourierServiceDto courierServiceDto);

	CourierServiceDto deleteCountryById(int id);

	CourierServiceDto createNewCourierService(CourierServiceDto courierServiceDto);

}
