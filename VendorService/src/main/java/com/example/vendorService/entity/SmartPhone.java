package com.example.vendorService.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
public class SmartPhone {

	@Id
	private int phoneid;
	private String phonename;
	private String phonemodel;
	
	
	public SmartPhone() {
		
	}


	public SmartPhone(int phoneid, String phonename, String phonemodel) {
		super();
		this.phoneid = phoneid;
		this.phonename = phonename;
		this.phonemodel = phonemodel;
	}


	public int getPhoneid() {
		return phoneid;
	}


	public void setPhoneid(int phoneid) {
		this.phoneid = phoneid;
	}


	public String getPhonename() {
		return phonename;
	}


	public void setPhonename(String phonename) {
		this.phonename = phonename;
	}


	public String getPhonemodel() {
		return phonemodel;
	}


	public void setPhonemodel(String phonemodel) {
		this.phonemodel = phonemodel;
	}


	@Override
	public String toString() {
		return "SmartPhone [phoneid=" + phoneid + ", phonename=" + phonename + ", phonemodel=" + phonemodel + "]";
	}
	
	
	
}
