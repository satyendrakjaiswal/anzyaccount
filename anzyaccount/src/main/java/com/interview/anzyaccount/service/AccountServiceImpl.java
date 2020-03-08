package com.interview.anzyaccount.service;

import com.interview.anzyaccount.entity.Account;
import com.interview.anzyaccount.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public List<Account> listAccounts() {
        return (List<Account>) accountRepository.findAll();
    }

    @Override
    public Account getAccountDetails(Integer accNum) {
        Optional<Account> optionalAccount = accountRepository.findById(accNum);
        if(optionalAccount.isPresent()){
            return optionalAccount.get();
        }
        else {
            throw new RuntimeException("no account found");// custom exception class pending
        }
    }
}
