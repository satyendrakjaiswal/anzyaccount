package com.interview.anzyaccount.repository;

import com.interview.anzyaccount.entity.Transaction;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface TransactionRepository extends CrudRepository<Transaction, Integer> {

    @Query(value = "SELECT * FROM transaction t where t.account_number = :accountNumber", nativeQuery=true)
    public Optional<List<Transaction>> findAllTransactionsByAccount(@Param("accountNumber") Integer accountNumber);

}
