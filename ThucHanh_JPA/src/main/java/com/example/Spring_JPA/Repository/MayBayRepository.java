package com.example.Spring_JPA.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Spring_JPA.Entity.ChuyenBay;
import com.example.Spring_JPA.Entity.MayBay;

@Repository
public interface MayBayRepository extends CrudRepository<MayBay, Integer>{

	@Query("Select mb from MayBay mb where mb.tamBay >10000")
	public List<MayBay> findAllMayBayByTamBay10000 ();
	
	@Query("Select mb from MayBay mb where mb.tamBay >10000")
	public List<MayBay> Cau7 ();
}
