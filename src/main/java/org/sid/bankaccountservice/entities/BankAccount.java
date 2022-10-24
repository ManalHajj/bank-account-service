package org.sid.bankaccountservice.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.bankaccountservice.enums.AccountType;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import java.util.Date;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
@Builder // design pattern easy way to create objects

public class BankAccount {
    @Id
    private String id;
    private Date createdAt;
    private Double balance;  // Double maj a null comme valeur par defaut quand c pas assigné double min a 0
    private String currency;
    @Enumerated(EnumType.STRING)
    private AccountType type;
}
