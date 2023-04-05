package ma.enset.bank_microservices;

import ma.enset.bank_microservices.entity.Account;
import ma.enset.bank_microservices.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankMicroServicesApplication implements CommandLineRunner {
    @Autowired
    AccountRepository accountRepository;
    public static void main(String[] args) {
        SpringApplication.run(BankMicroServicesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        accountRepository.save(new Account(2L, 987654321, "Alice Johnson", AccountType.SAVINGS, 2500.00));
        accountRepository.save(new Account(3L, 555555555, "Bob Williams", AccountType.CHECKING, 3500.00));
        accountRepository.save(new Account(4L, 111111111, "Charlie Davis", AccountType.INVESTMENT, 10000.00));
        accountRepository.save(new Account(5L, 222222222, "David Lee", AccountType.SAVINGS, 500.00));
        accountRepository.save(new Account(6L, 333333333, "Emily Chen", AccountType.CHECKING, 8000.00));
        accountRepository.save(new Account(7L, 444444444, "Frank Smith", AccountType.INVESTMENT, 200000.00));
        accountRepository.save(new Account(8L, 666666666, "Grace Lee", AccountType.SAVINGS, 1500.00));
        accountRepository.save(new Account(9L, 777777777, "Henry Wong", AccountType.CHECKING, 700.00));

    }
}
