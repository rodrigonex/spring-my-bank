package br.com.mybank.model;

import java.util.UUID;
import java.time.LocalDateTime;

import org.hibernate.annotations.GenericGenerator;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "historyMoviments")
public class HistoryMovimentModel {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;
    @Column(nullable = false)
    private UUID account_id;
    private Boolean accountBalance;
    private Boolean newBalance;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime changeDate;

    public LocalDateTime getChangeDate() {
        return changeDate;
    }

    @PrePersist
    public void prePersist() {
        if (changeDate == null) {
            changeDate = LocalDateTime.now();
        }
    }

    public Boolean getNewBalance() {
        return newBalance;
    }

    public void setNewBalance(Boolean newBalance) {
        this.newBalance = newBalance;
    }

    public Boolean getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Boolean accountBalance) {
        this.accountBalance = accountBalance;
    }

    public UUID getAccount_id() {
        return account_id;
    }

    public void setAccount_id(UUID account_id) {
        this.account_id = account_id;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
