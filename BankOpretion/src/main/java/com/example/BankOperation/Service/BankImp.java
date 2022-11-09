package com.example.BankOperation.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.BankOperation.Repository.BankRepo;
import com.example.BankOperation.entity.Bank;
@Component
@Service
public class BankImp implements BankInterface {

	@Autowired
	BankRepo bankRepo;
	
	
	@Override
	public List<Bank> getAllBank() {
		List<Bank> list1=bankRepo.findAll();
		return list1;
	}

	@Override
	public Bank createBank(Bank bank) {
		Bank bank1=bankRepo.save(bank);
		return bank1;
	}

	@Override
	public List<Bank> getBank(long bankemployee) {
		List<Bank> list2=bankRepo.findAll();
		return list2;
	}

	@Override
	public List<Bank> getAllBank(String bankname) {
	List<Bank> list3=bankRepo.getAllBankDetails(bankname);
		return list3;
	}

	@Override
	public List<Bank> getAllBankOpretion(int bankid, String bankname) {
		List<Bank>list4=bankRepo.getFindByBank(bankid, bankname);
		return list4;
	}

	@Override
	public List<Bank> getAllBankLocOpertaion(String bankloc) {
		List<Bank>list5=bankRepo.getFindBankLoc(bankloc);
		return list5;
	}

	@Override
	public List<Bank> getAllBankDetails(int bankid, String bankname) {
		List<Bank>list6=bankRepo.getFindBYIdAndBankName(bankid, bankname);
		return list6;
	}

	@Override
	public Bank upadateBank(Bank bank) {
		Optional<Bank> bank2=bankRepo.findById(bank.getBankid());
		Bank bk=bank2.get();
		bk.setBankname(bank.getBankname());
		bk.setBankloc(bank.getBankloc());
		bk.setBankemployee(bank.getBankemployee());
		bankRepo.save(bk);
		return bk;
	}

	@Override
	public int deleteBank(int bankid) {
		bankRepo.delete(bankid);
		return bankid;
		
	}

	
	
	

}
