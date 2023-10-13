package com.ecom.pojo;
import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="admin_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {
	
	@Id
	private long adminId;
	
	@Column(name="adminName",length=20)
	private String adminName;
	
	@Column(name="adminEmail",length=20)
	private String adminEmail;
	
//	@Column(name="username",length=length=20)
//	private String username;
	
	@Column(name="adminPassword",length=20)
	private String adminPassword;
}
