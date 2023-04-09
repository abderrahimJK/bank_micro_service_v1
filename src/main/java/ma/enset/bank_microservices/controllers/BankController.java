package ma.enset.bank_microservices.controllers;

import lombok.Data;
import ma.enset.bank_microservices.entity.Account;
import ma.enset.bank_microservices.repository.AccountRepository;
import ma.enset.bank_microservices.service.AccountService;
import ma.enset.bank_microservices.service.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Data
public class BankController {

    @Autowired
    AccountServiceImpl accountService;

    @GetMapping("/accounts")
    public List<Account> getAllAccount(){
        return accountService.getAllAccount();
    }

    @GetMapping("/account/{id}")
    public Account getAccount(@PathVariable long id){
        return accountService.getAccount(id);
    }

    @PostMapping
    public void addAccount(@RequestBody Account account){

        accountService.save(account);
    }

}
