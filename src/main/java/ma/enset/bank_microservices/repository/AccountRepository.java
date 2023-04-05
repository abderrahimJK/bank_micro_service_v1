package ma.enset.bank_microservices.repository;

import ma.enset.bank_microservices.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AccountRepository extends JpaRepository<Account, Long> {
    @Query("SELECT a from Account a where a.id=:id")
    public Account findOne(@Param("id") long id);
}
