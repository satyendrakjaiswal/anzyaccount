package com.interview.anzyaccount;

import com.interview.anzyaccount.entity.Account;
import com.interview.anzyaccount.entity.Transaction;
import com.interview.anzyaccount.repository.AccountRepository;
import com.interview.anzyaccount.repository.TransactionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static java.sql.Types.NULL;

@SpringBootApplication
public class AnzyaccountApplication {

	private static final Logger log = LoggerFactory.getLogger(AnzyaccountApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AnzyaccountApplication.class, args);
	}
	@Bean
	public CommandLineRunner demoData(AccountRepository accountRepository, TransactionRepository transactionRepository) {
		return (args) -> {
			accountRepository.save(new Account(123456, "AUSavings123", "Savings", "08/11/2016", "AUD", 123423.43));
			accountRepository.save(new Account(456789, "SGSavings222", "Savings", "01/10/2018", "SGD", 323423.4));
			accountRepository.save(new Account(111111, "AUCurrent111", "Current", "08/02/2014", "AUD", 24243.89));
			accountRepository.save(new Account(333333, "AUSavings333", "Savings", "08/12/2011", "AUD", 343244.89));
			accountRepository.save(new Account(444444, "SGSavings444", "Current", "01/12/2018", "SGD", 3233.554));
			accountRepository.save(new Account(555555, "SGCurrent555", "Savings", "23/12/2011", "SGD", 343244.89));

			transactionRepository.save(new Transaction( 1,123456, "AUSavings123", "Jan 12 2014", "AUD", NULL ,34324.45, "Credit", "some credit transaction"));
			transactionRepository.save(new Transaction( 2,123456, "AUSavings123", "Jan 18 2014", "AUD", 646.76 ,NULL, "Debit", "some Debit transaction"));
			transactionRepository.save(new Transaction( 3,456789, "SGSavings222", "Feb 28 2018", "SGD", NULL ,63454, "Credit", "some credit transaction"));
			transactionRepository.save(new Transaction( 4,111111, "AUCurrent111", "Dec 25 2011", "AUD", NULL ,34324.45, "Credit", "some credit transaction"));
			transactionRepository.save(new Transaction( 5,111111, "AUCurrent111", "Jan 12 2014", "AUD", 313331 ,NULL, "Debit", "some Debit transaction"));
			transactionRepository.save(new Transaction( 6,333333, "AUSavings333", "Jan 12 2014", "AUD", NULL ,34324.45, "Credit", "some credit transaction"));
			transactionRepository.save(new Transaction( 7,333333, "AUSavings333", "Jan 30 2019", "AUD", NULL ,453535.9, "Credit", "some credit transaction"));
			transactionRepository.save(new Transaction( 8,555555, "SGCurrent555", "Jan 12 2014", "SGD", NULL ,3554357.56, "Credit", "some credit transaction"));

			for (Account account : accountRepository.findAll()) {
				log.info("The account is: " + account.toString());
			}
			for (Transaction transaction : transactionRepository.findAll()) {
				log.info("The transaction is: " + transaction.toString());
			}
		};
	}
}
