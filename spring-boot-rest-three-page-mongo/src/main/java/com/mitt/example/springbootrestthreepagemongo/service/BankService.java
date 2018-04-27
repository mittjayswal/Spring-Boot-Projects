package com.mitt.example.springbootrestthreepagemongo.service;

import java.util.List;
import java.util.Optional;

import com.mitt.example.springbootrestthreepagemongo.model.BankVO;

public interface BankService {

	List<BankVO> getAllBankInfo();
	BankVO getbankInfo(String firstName);
	BankVO addBankInfo(BankVO bvo);
	BankVO updateBankInfo(BankVO bvo);
	void deleteBankInfo(String id);
	
}
