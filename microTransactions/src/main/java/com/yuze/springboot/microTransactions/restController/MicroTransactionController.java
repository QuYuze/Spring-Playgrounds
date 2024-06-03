package com.yuze.springboot.microTransactions.restController;

import com.yuze.springboot.microTransactions.dao.MicroTransactionDAO;
import com.yuze.springboot.microTransactions.entity.MicroTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/microtransactions")
public class MicroTransactionController {

    private MicroTransactionDAO microTransactionDAO;

    @Autowired
    public MicroTransactionController(@Qualifier("microTransactionDAOImple") MicroTransactionDAO microTransactionDAO){
        this.microTransactionDAO = microTransactionDAO;
    }

    @PostMapping("/microtransaction/{merchandise}/{date}/{amount}")
    public void postMicroTransactions(@PathVariable String merchandise, @PathVariable String date, @PathVariable double amount){
        System.out.println("Creating new Micro Transaction...");
        MicroTransaction microTransaction = new MicroTransaction(merchandise, date, amount);
        microTransactionDAO.save(microTransaction);
        System.out.println("New Micro Transaction Saved: "+microTransaction.toString());
    }

    @GetMapping("/microtransaction")
    public List<MicroTransaction> getAllMicroTransactions(){
        System.out.println("Returning All exists MicroTransactions...");
        List<MicroTransaction> microTransactionList = microTransactionDAO.findAll();
        return  microTransactionList;
    }

    @GetMapping("/microtransaction/{date}")
    public List<MicroTransaction> getAllMicroTransactions(@PathVariable String date){
        System.out.println("Finding All exists MicroTransactions with date equals to: " + date);
        List<MicroTransaction> microTransactionList = microTransactionDAO.findByDate(date);
        return  microTransactionList;
    }
}
