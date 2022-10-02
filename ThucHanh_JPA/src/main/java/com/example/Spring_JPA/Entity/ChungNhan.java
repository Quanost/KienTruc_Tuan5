package com.example.Spring_JPA.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "chungnhan")
public class ChungNhan {
	
	@Id
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "MaNV")
	private NhanVien nhanVien;

	@ManyToOne
	@JoinColumn(name = "MaMB")
	private MayBay mayBay;
}
