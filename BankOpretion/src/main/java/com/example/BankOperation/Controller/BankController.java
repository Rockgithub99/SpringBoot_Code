package com.example.BankOperation.Controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.BankOperation.Repository.BankRepo;
import com.example.BankOperation.Service.BankImp;
import com.example.BankOperation.Service.BankInterface;
import com.example.BankOperation.entity.Bank;

@RestController

@RequestMapping("/AllBank")
public class BankController {

	/*
	 * @Autowired BankRepo bankRepo;
	 */
	/*
	 * @GetMapping("/getBank") public List<Bank> getAllBank() { List<Bank> list1 =
	 * bankRepo.findAll();
	 * 
	 * return list1;
	 * 
	 * }
	 * 
	 * @PostMapping("/postBank")
	 * 
	 * public Bank createBank(@RequestBody Bank bank) { bankRepo.save(bank); return
	 * bank;
	 * 
	 * }
	 * 
	 * @GetMapping("/All/{bankemployee}") public List<Bank> getBank(@PathVariable
	 * long bankemployee) {
	 * 
	 * List<Bank> list2 = bankRepo.findAll(); List<Bank> list3 =
	 * list2.stream().filter(x -> x.getBankemployee() >=
	 * bankemployee).collect(Collectors.toList()); return list3; }
	 * 
	 * @GetMapping("/getBank/{bankname}") public List<Bank> getAllBank(@PathVariable
	 * String bankname) {
	 * 
	 * List<Bank> listBank = bankRepo.getAllBankDetails(bankname); return listBank;
	 * 
	 * }
	 * 
	 * @GetMapping("/getDetails/{bankid}/{bankname}") public List<Bank>
	 * getAllBankOpretion(@PathVariable int bankid, @PathVariable String bankname) {
	 * 
	 * List<Bank> listBank = bankRepo.getFindByBank(bankid, bankname); return
	 * listBank; }
	 * 
	 * 
	 * @GetMapping("/getBankdetails/{bankloc}") public List<Bank>
	 * getAllBankLocOpertaion(@RequestParam String bankloc){
	 * List<Bank>list4=bankRepo.getFindBankLoc(bankloc); return list4;
	 * 
	 * }
	 * 
	 * @GetMapping("/getAllDetails/{bankid}/{bankname}") public List<Bank>
	 * getAllBankDetails(@PathVariable int bankid ,@PathVariable String bankname){
	 * 
	 * List<Bank> list5=bankRepo.getFindBYIdAndBankName(bankid, bankname); return
	 * list5;
	 * 
	 * }
	 */

	@Autowired
	BankInterface bankImp;

	@GetMapping("/getBank")
	public List<Bank> getAllBank() {
		List<Bank> list1 = bankImp.getAllBank();

		return list1;

	}

	@PostMapping("/postBank")

	public Bank createBank(@RequestBody Bank bank) {
		bankImp.createBank(bank);
		return bank;

	}

	@GetMapping("/All/{bankemployee}")
	public List<Bank> getBank(@PathVariable long bankemployee) {

		List<Bank> list2 = bankImp.getBank(bankemployee);
		List<Bank> list3 = list2.stream().filter(x -> x.getBankemployee() >= bankemployee).collect(Collectors.toList());
		return list3;
	}

	@GetMapping("/getBank/{bankname}")
	public List<Bank> getAllBank(@PathVariable String bankname) {

		List<Bank> listBank = bankImp.getAllBank(bankname);
		return listBank;

	}

	@GetMapping("/getDetails/{bankid}/{bankname}")
	public List<Bank> getAllBankOpretion(@PathVariable int bankid, @PathVariable String bankname) {

		List<Bank> listBank = bankImp.getAllBankOpretion(bankid, bankname);
		return listBank;
	}

	@GetMapping("/getBankdetails/{bankloc}")
	public List<Bank> getAllBankLocOpertaion(@RequestParam String bankloc) {
		List<Bank> list4 = bankImp.getAllBankLocOpertaion(bankloc);
		return list4;

	}

	@GetMapping("/getAllDetails/{bankid}/{bankname}")
	public List<Bank> getAllBankDetails(@PathVariable int bankid, @PathVariable String bankname) {

		List<Bank> list5 = bankImp.getAllBankDetails(bankid, bankname);
		return list5;

	}
	
	
	@PutMapping("/putBank")
	public Bank upadateBank(@RequestBody Bank bank ) {
		Bank bk1=bankImp.upadateBank(bank);
		
		return bk1;
		
	}

	
	@DeleteMapping("/deleteBankId/{bankid}")
	
	public int deleteBank(@PathVariable int bankid) {
		int bank=bankImp.deleteBank(bankid);
		
		return bank;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
