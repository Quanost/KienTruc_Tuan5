package com.example.Spring_JPA.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Spring_JPA.Entity.ChuyenBay;
import com.example.Spring_JPA.Entity.MayBay;
import com.example.Spring_JPA.Repository.ChuyenBayRepository;
import com.example.Spring_JPA.Repository.MayBayRepository;

@Service
public class MayBay_Service {
	@Autowired
	 MayBayRepository mayBayRepository;
	
	public List<MayBay> findAllMayBayByTamBayLon10000 (){
		List<MayBay> mayBays = mayBayRepository.findAllMayBayByTamBay10000();
		return (List<MayBay>) mayBayRepository.saveAll(mayBays) ;
		
	}
}
