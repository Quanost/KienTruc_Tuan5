package com.example.Spring_JPA.Service;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Spring_JPA.Entity.ChuyenBay;
import com.example.Spring_JPA.Repository.ChuyenBayRepository;

@Service
public class ChuyenBay_Service {
	@Autowired
	private ChuyenBayRepository chuyenBayRepository;
	
	public List<ChuyenBay> findAllChuyenBayByGaDen (String gaDen){
		List<ChuyenBay> chuyenBays = chuyenBayRepository.findAllChuyenBayByGaDen(gaDen);
		return (List<ChuyenBay>) chuyenBayRepository.saveAll(chuyenBays) ;
		
	}
	
}
