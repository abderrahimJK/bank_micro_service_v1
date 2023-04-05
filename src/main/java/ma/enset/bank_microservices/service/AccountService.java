package ma.enset.bank_microservices.service;

import ma.enset.bank_microservices.entity.Account;

import java.util.List;

public interface AccountService {

    void save(Account a);
    Account getAccount(long id);
    List<Account> getAllAccount();
    Account update(Account a);
    Account delete(Long id);
}
