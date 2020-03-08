package com.interview.anzyaccount.service;

import com.interview.anzyaccount.entity.Transaction;

import java.util.List;

public interface TransactionService {
    List<Transaction> getTransactionsOfAccount(Integer accountNumber);
}
