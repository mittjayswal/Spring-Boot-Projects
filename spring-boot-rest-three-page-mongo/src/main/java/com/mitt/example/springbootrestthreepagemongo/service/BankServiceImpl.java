package com.mitt.example.springbootrestthreepagemongo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.mitt.example.springbootrestthreepagemongo.model.BankVO;
import com.mitt.example.springbootrestthreepagemongo.respository.BankRepository;

@Service
public class BankServiceImpl implements BankService {

	@Autowired
	BankRepository bankRepo;
	
	@Override
	public List<BankVO> getAllBankInfo() {
		return bankRepo.findAll();
	}

	@Override
	public BankVO getbankInfo(String id) {
		return null;
	}

	@Override
	public BankVO addBankInfo(BankVO bvo) {
		System.out.println("Service data= "+bvo.getFirstName());
		return bankRepo.save(bvo);
	}

	@Override
	public BankVO updateBankInfo(BankVO bvo) {
		return bankRepo.save(bvo);
		
	}

	@Override
	public void deleteBankInfo(String id) {
		bankRepo.deleteById(id);
	}

}
