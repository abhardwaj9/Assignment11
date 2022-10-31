package com.codercampus.Assignment11.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codercampus.Assignment11.domain.Transaction;
import com.codercampus.Assignment11.repository.TransactionRepository;

@Service
public class TransactionService {

	@Autowired
	private TransactionRepository transRepo;

	public List<Transaction> findAll() {
		List<Transaction> transactions = transRepo.findAll();
		Collections.sort(transactions);
		return transactions;
	}

	public Transaction findById(Long transId) {
	
		for(Transaction transaction : transRepo.findAll()) {
			if(transaction.getId().equals(transId)) {
				return transaction;
			}
		}
		return null;

	}

}
