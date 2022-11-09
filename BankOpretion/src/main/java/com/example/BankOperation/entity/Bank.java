package com.example.BankOperation.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode

@Entity
@Table(name="Bank_Name")
public class Bank {
	
	
	@Id
	private int bankid;
	private String bankname;
	private String bankloc;
	private long bankemployee;
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bank(int bankid, String bankname, String bankloc, long bankemployee) {
		super();
		this.bankid = bankid;
		this.bankname = bankname;
		this.bankloc = bankloc;
		this.bankemployee = bankemployee;
	}
	public int getBankid() {
		return bankid;
	}
	public void setBankid(int bankid) {
		this.bankid = bankid;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getBankloc() {
		return bankloc;
	}
	public void setBankloc(String bankloc) {
		this.bankloc = bankloc;
	}
	public long getBankemployee() {
		return bankemployee;
	}
	public void setBankemployee(long bankemployee) {
		this.bankemployee = bankemployee;
	}
	@Override
	public String toString() {
		return "Bank [bankid=" + bankid + ", bankname=" + bankname + ", bankloc=" + bankloc + ", bankemployee="
				+ bankemployee + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(bankemployee, bankid, bankloc, bankname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bank other = (Bank) obj;
		return bankemployee == other.bankemployee && bankid == other.bankid && Objects.equals(bankloc, other.bankloc)
				&& Objects.equals(bankname, other.bankname);
	}
	
	

}
