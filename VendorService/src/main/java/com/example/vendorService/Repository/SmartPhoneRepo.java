package com.example.vendorService.Repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.vendorService.entity.SmartPhone;

@Repository
public interface SmartPhoneRepo extends JpaRepository<SmartPhone,Integer> {



}
