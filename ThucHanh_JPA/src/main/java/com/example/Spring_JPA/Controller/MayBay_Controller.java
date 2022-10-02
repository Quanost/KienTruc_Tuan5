package com.example.Spring_JPA.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Spring_JPA.Entity.ChuyenBay;
import com.example.Spring_JPA.Entity.MayBay;
import com.example.Spring_JPA.Service.MayBay_Service;


@RestController
public class MayBay_Controller {
	@Autowired
	MayBay_Service maybay_service;
	
	@GetMapping("/maybayTamBayLon10000")
	public List<MayBay> findAllMayBayByTamBayLon10000(){
		return maybay_service.findAllMayBayByTamBayLon10000();
	}

}
