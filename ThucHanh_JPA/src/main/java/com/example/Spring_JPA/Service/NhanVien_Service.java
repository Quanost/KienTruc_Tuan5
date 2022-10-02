package com.example.Spring_JPA.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Spring_JPA.Entity.MayBay;
import com.example.Spring_JPA.Entity.NhanVien;
import com.example.Spring_JPA.Repository.MayBayRepository;
import com.example.Spring_JPA.Repository.NhanVienRepository;

@Service
public class NhanVien_Service {
	@Autowired
	 NhanVienRepository nhanVienRepository;
	
	public List<NhanVien> findAllNhanVienByLuongNho10000 (){
		List<NhanVien> nhanViens = nhanVienRepository.findAllNhanVienByLuong10000();
		return (List<NhanVien>) nhanVienRepository.saveAll( nhanViens) ;
		
	}
}
