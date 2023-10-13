package com.ecom.pojo;
import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="product_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	@Id
	private String product_Id;
	
	@Column(name="product_link",length=30)
	private String product_link;
	
	@Column(name="product_count",length=20)
	private int Product_count;
	
	@Column(name="product_price",length=20)
	private double price;
	
}
