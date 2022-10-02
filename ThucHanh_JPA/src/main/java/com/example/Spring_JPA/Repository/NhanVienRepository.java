package com.example.Spring_JPA.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Spring_JPA.Entity.MayBay;
import com.example.Spring_JPA.Entity.NhanVien;

@Repository
public interface NhanVienRepository extends CrudRepository<NhanVien, String>{
	@Query("Select nv from NhanVien nv where nv.luong < 10000")
	public List<NhanVien> findAllNhanVienByLuong10000 ();
}
