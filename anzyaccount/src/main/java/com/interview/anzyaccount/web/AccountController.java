package com.interview.anzyaccount.web;

import com.interview.anzyaccount.entity.Account;
import com.interview.anzyaccount.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/anz")
public class AccountController {

    private AccountService accountService;

    @Autowired
    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/accounts")
    public ResponseEntity<List<Account>> getAllAccounts(){
        List<Account> accounts = accountService.listAccounts();
        return new ResponseEntity<List<Account>>(accounts, HttpStatus.OK);
    }

    @GetMapping("/account/{accNum}")
    public ResponseEntity<Account> getAccountDetails(@PathVariable("accNum") Integer accNum){
        try {
            return new ResponseEntity<Account>(accountService.getAccountDetails(accNum),HttpStatus.OK);
        }
        catch ( RuntimeException e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Account Not Found");
        }
    }
}
