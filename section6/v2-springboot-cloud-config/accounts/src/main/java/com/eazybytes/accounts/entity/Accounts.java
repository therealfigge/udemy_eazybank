package com.eazybytes.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Entity
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
@EnableJpaRepositories("com.eazybytes.accounts.repository")
public class Accounts extends BaseEntity {

    @Column(name = "customer_id")
    private  Long customerId;

    @Id
    @Column(name = "account_number")
    private Long accountNumber;

    private String accountType;

    private String branchAddress;
}
