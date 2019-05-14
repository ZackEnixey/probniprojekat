package com.project.webapp.service;

import java.util.List;

import com.project.webapp.dto.response.ProductDto;

public interface ProductService {

	List<ProductDto> findAllProducts();

	ProductDto findProductById(int id);

	ProductDto editProduct(int id, ProductDto productDto);

	ProductDto createNewProduct(ProductDto productDto, String email);

	ProductDto deleteProduct(int id );

	ProductDto createNewProductCOPYmethod(ProductDto productDto);

}
