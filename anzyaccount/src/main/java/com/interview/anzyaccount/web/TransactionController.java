package com.interview.anzyaccount.web;

import com.interview.anzyaccount.entity.Account;
import com.interview.anzyaccount.entity.Transaction;
import com.interview.anzyaccount.service.TransactionService;
import org.springframework.beans.factory.ListableBeanFactory;
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
public class TransactionController {

    private TransactionService transactionService;

    @Autowired
    public void setTransactionService(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping("/transactions/{accNum}")
    public ResponseEntity<List<Transaction>> getAccountTransactions(@PathVariable("accNum") Integer accNum){
        try {
            return new ResponseEntity<List<Transaction>>(transactionService.getTransactionsOfAccount(accNum)
                    , HttpStatus.OK);
        }
        catch ( RuntimeException e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No Transaction Found");
        }
    }
}
