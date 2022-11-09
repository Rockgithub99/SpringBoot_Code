package com.example.BankOperation.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.BankOperation.entity.Bank;

@Service
public interface BankInterface {

	public List<Bank> getAllBank();

	public Bank createBank(Bank bank);

	public List<Bank> getBank(long bankemployee);

	public List<Bank> getAllBank(String bankname);

	public List<Bank> getAllBankOpretion(int bankid, String bankname);

	public List<Bank> getAllBankLocOpertaion(String bankloc);

	public List<Bank> getAllBankDetails(int bankid, String bankname);
	
	public Bank upadateBank( Bank bank);
	
	public int deleteBank( int bankid);



}
