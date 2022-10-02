package com.example.Spring_JPA.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Spring_JPA.Entity.ChuyenBay;
import com.example.Spring_JPA.Service.ChuyenBay_Service;

@RestController
public class ChuyenBay_Controller {
	@Autowired
	ChuyenBay_Service chuyenbay_service;
	
	@GetMapping("/chuyenbayDaLat")
	public List<ChuyenBay> findAllChuyenBayByDaLat(){
		return chuyenbay_service.findAllChuyenBayByGaDen("DAD");
	}
}
