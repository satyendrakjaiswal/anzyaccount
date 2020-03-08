package com.interview.anzyaccount.repository;

import com.interview.anzyaccount.entity.Account;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AccountRepository extends CrudRepository<Account, Integer> {
}
