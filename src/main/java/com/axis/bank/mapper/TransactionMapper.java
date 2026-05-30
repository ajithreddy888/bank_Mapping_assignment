package com.axis.bank.mapper;

import com.axis.bank.dto.TransactionDto;
import com.axis.bank.entity.Transaction;

public class TransactionMapper {

    public static TransactionDto toDto(Transaction txn) {

        TransactionDto dto = new TransactionDto();

        dto.setTransactionId(txn.getTransactionId());
        dto.setTransactionType(txn.getTransactionType());
        dto.setAmount(txn.getAmount());
        dto.setTransactionDate(txn.getTransactionDate());
        dto.setAccountNumber(txn.getAccount().getAccountNumber());

        return dto;
    }
}