package com.axis.bank.service;

import java.util.List;

import com.axis.bank.dto.TransactionDto;

public interface ITransactionService {


	String deposit(String accountNumber, double amount);

	String withdraw(String accountNumber, double amount);

	List<TransactionDto> getTransactionsByAccount(String accountNumber);


}
