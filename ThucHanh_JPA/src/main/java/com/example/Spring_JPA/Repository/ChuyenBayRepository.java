package com.example.Spring_JPA.Repository;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Spring_JPA.Entity.ChuyenBay;

@Repository
public interface ChuyenBayRepository extends CrudRepository<ChuyenBay, String>{

	@Query("Select cb from ChuyenBay cb where cb.gaDen = ?1")
	public List<ChuyenBay> findAllChuyenBayByGaDen (String gaDen);
	

	@Query(value="Select cb from ChuyenBay cb where cb.gaDen = ?1", nativeQuery = true)
	public List<ChuyenBay> findAllChuyenBayByDuongBay (String gaDen);
	
}
