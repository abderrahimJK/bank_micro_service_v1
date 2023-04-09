package ma.enset.bank_microservices.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.enset.bank_microservices.AccountType;

@Entity
@Data @AllArgsConstructor
@NoArgsConstructor @Builder
public class Account {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int account_num;
    private String name;
    @Enumerated(EnumType.STRING)
    private AccountType account_type;
    private double sold;


}
