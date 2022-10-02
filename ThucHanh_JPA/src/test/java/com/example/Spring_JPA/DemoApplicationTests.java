package com.example.Spring_JPA;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.Spring_JPA.Repository.ChuyenBayRepository;
import com.example.Spring_JPA.Repository.MayBayRepository;
import com.example.Spring_JPA.Repository.NhanVienRepository;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	ChuyenBayRepository chuyenBayRepository;
	
	@Autowired
	MayBayRepository mayBayRepository;
	
	@Autowired
	NhanVienRepository nhanVienRepository;
	
	@Test
	public void Ex1() {
		chuyenBayRepository.findAllChuyenBayByGaDen("DAD").forEach(cb -> System.out.println(cb.toString()));
	}
	
	@Test
	public void Ex2() {
		 mayBayRepository.findAllMayBayByTamBay10000().forEach(mb -> System.out.println(mb.toString()));
	}
	
}
