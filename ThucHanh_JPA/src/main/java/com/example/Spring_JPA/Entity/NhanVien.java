package com.example.Spring_JPA.Entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "nhanvien")
public class NhanVien {
	@Id
	@Column(name = "MaNV")
	@GeneratedValue
	private String maNhanVien;

	@Column(name = "Ten")
	private String tenNhanVien;
	

	@Column(name = "Luong")
	private int luong;
	
	@OneToMany(mappedBy = "nhanVien")
    private Set<ChungNhan> chungNhan;

	public NhanVien() {
		// TODO Auto-generated constructor stub
	}
	public NhanVien(String maNhanVien, String tenNhanVien, int luong) {
		super();
		this.maNhanVien = maNhanVien;
		this.tenNhanVien = tenNhanVien;
		this.luong = luong;
	}
	public String getMaNhanVien() {
		return maNhanVien;
	}
	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}
	public String getTenNhanVien() {
		return tenNhanVien;
	}
	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}
	public int getLuong() {
		return luong;
	}
	public void setLuong(int luong) {
		this.luong = luong;
	}
	@Override
	public String toString() {
		return "NhanVien [maNhanVien=" + maNhanVien + ", tenNhanVien=" + tenNhanVien + ", luong=" + luong + "]";
	}
	
}
