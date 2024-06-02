package com.yuze.springboot.microTransactions;

import com.yuze.springboot.microTransactions.dao.MicroTransactionDAO;
import com.yuze.springboot.microTransactions.entity.MicroTransaction;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MicroTransactionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroTransactionsApplication.class, args);
	}

/*
	@Bean
	public CommandLineRunner commandLineRunner(MicroTransactionDAO microTransactionDAO){
		return runner -> {
			createMicroTransaction(microTransactionDAO);
		};
	}
*/
	private void createMicroTransaction(MicroTransactionDAO microTransactionDAO) {

		System.out.println("Create new record of MicroTransactions...");
		MicroTransaction microTransaction = new MicroTransaction("Book of Heroes", "2024-06-02", 2.99);
		microTransactionDAO.save(microTransaction);

	}
}
