package com.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.pojo.Admin;



@Repository
public interface AdminInfoRepository extends JpaRepository<Admin, Long>{

}
