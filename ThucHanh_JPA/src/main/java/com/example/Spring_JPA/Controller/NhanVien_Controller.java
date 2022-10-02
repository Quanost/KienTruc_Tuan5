package com.example.Spring_JPA.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.Spring_JPA.Entity.NhanVien;
import com.example.Spring_JPA.Service.NhanVien_Service;

@RestController
public class NhanVien_Controller {
	@Autowired
	NhanVien_Service nhanvien_service;
	
	@GetMapping("/nhanvienLuongNho10000")
	public List<NhanVien> findAllMayBayByTamBayLon10000(){
		return nhanvien_service.findAllNhanVienByLuongNho10000();
	}
}
