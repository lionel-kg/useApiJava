package com.ynov.client.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ynov.client.model.Product;
import com.ynov.client.repository.ProductProxy;

@Service
public class ProductService {
	
	@Autowired
	private ProductProxy productProxy;
	
	public List<Product> getProduct(){
		return productProxy.getProducts();
	}
}
