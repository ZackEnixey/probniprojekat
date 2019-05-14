package com.project.webapp.service;

import java.util.List;

import com.project.webapp.dto.request.PurchaseRequestDTO;
import com.project.webapp.dto.response.PurchaseDto;

public interface PurchaseService {

	List<PurchaseDto> getAllPurchases();

	PurchaseDto findProductById(int id);

	PurchaseDto editProduct(int id, PurchaseDto purchaseDto);

	PurchaseDto createNewProduct(PurchaseDto purchaseDto);

	PurchaseDto deleteProduct(int id );

	PurchaseDto buy(PurchaseRequestDTO purchaseRequestDTO, String name);

}
