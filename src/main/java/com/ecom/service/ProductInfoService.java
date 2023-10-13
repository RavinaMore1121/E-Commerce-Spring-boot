package com.ecom.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.ecom.pojo.Product;
import com.ecom.repository.ProductInfoRepository;


public class ProductInfoService {
	@Autowired
	private ProductInfoRepository productInfoRepository;
	
	public Product createProduct(Product product) {
		return productInfoRepository.save(product);
	}
	
	public Optional<Product> findByProductId(long productId) {
		return productInfoRepository.findById(productId);
	}
	
	public List<Product> findAllProduct() {
		return 	productInfoRepository.findAll();
	}
	
	public Product  updateProduct(Product product)
	{
		return productInfoRepository.save(product);
	}
	
	public void deleteProduct(long productId) {
	   productInfoRepository.deleteById(productId);
	}	
}
