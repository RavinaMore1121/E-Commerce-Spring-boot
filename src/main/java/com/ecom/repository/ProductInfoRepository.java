package com.ecom.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.pojo.Product;
@Repository
public interface ProductInfoRepository extends JpaRepository<Product, Long>{
	
}
