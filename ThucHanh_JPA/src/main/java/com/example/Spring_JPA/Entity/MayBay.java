package com.example.Spring_JPA.Entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "maybay")
public class MayBay {
	@Id
	@Column(name = "MaMB")
	@GeneratedValue
	private int maMayBay;
	@Column(name = "Loai")
	private String loai;
	@Column(name = "TamBay")
	private int tamBay;
	
	@OneToMany(mappedBy = "mayBay")
    private Set<ChungNhan> chungNhan;

	public MayBay() {
		// TODO Auto-generated constructor stub
	}

	public MayBay(int maMayBay, String loai, int tamBay) {
		super();
		this.maMayBay = maMayBay;
		this.loai = loai;
		this.tamBay = tamBay;
	}

	public int getMaMayBay() {
		return maMayBay;
	}

	public void setMaMayBay(int maMayBay) {
		this.maMayBay = maMayBay;
	}

	public String getLoai() {
		return loai;
	}

	public void setLoai(String loai) {
		this.loai = loai;
	}

	public int getTamBay() {
		return tamBay;
	}

	public void setTamBay(int tamBay) {
		this.tamBay = tamBay;
	}

	@Override
	public String toString() {
		return "MayBay [maMayBay=" + maMayBay + ", loai=" + loai + ", tamBay=" + tamBay + "]";
	}
	
}
