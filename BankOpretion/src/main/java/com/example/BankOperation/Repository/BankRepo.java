package com.example.BankOperation.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.BankOperation.entity.Bank;
@Repository
public interface BankRepo extends JpaRepository<Bank,Integer> {
	

	
	@Query(value="select * from Bank_Name where bankname=?1", nativeQuery = true)
	 public List<Bank> getAllBankDetails (String bankname);
    
	@Query(value="Select * from Bank_Name where bankid=?1 and bankname=?2", nativeQuery=true)
	public List<Bank> getFindByBank(int bankid, String bankname);
    
	
	@Query(value="select * from Bank_name where bankloc=?1", nativeQuery=true)
	public List<Bank> getFindBankLoc(String bankloc);

	@Query(value="select * from Bank_Name where bankid >=?1 or bankname=?2 ", nativeQuery=true)
	public List<Bank> getFindBYIdAndBankName(int bankid, String bankname );
	
	@Query(value="select * from Bank_Name", nativeQuery=true)
	public Bank findBYId(Bank bank);
	
	@Query(value="select * from Bank_Name where bankid=?1", nativeQuery=true)
	public Bank delete(int bankid);
	
	
	
	
}
