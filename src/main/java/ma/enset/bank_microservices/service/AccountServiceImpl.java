package ma.enset.bank_microservices.service;

import lombok.Data;
import ma.enset.bank_microservices.entity.Account;
import ma.enset.bank_microservices.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class AccountServiceImpl implements AccountService{

    @Autowired
    AccountRepository accountRepository;
    @Override
    public void save(Account a) {

    }

    @Override
    public Account getAccount(long id) {
        return accountRepository.findOne(id);
    }

    @Override
    public List<Account> getAllAccount() {
        return accountRepository.findAll();
    }

    @Override
    public Account update(Account a) {
        return null;
    }

    @Override
    public Account delete(Long id) {
        return null;
    }
}
