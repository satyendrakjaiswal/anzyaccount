package com.interview.anzyaccount.service;

import com.interview.anzyaccount.entity.Transaction;
import com.interview.anzyaccount.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    TransactionRepository transactionRepository;

    @Override
    public List<Transaction> getTransactionsOfAccount(Integer accountNumber) {
        Optional<List<Transaction>> optionalTransactions
                = transactionRepository.findAllTransactionsByAccount(accountNumber);

        if(optionalTransactions.isPresent()){
            return optionalTransactions.get();
        }
        else {
            throw new RuntimeException("no transaction found");// custom exception class pending
        }
    }
}
