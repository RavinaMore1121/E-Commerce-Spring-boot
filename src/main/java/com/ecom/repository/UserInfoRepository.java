package com.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.pojo.User;

@Repository
public interface UserInfoRepository extends JpaRepository<User, Long>{

}
