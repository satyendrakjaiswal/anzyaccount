package com.interview.anzyaccount.service;

import com.interview.anzyaccount.entity.Account;

import java.util.List;

public interface AccountService {
    List<Account> listAccounts();
    Account getAccountDetails(Integer accNum);
}
