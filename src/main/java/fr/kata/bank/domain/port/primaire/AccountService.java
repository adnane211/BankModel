package fr.kata.bank.domain.port.primaire;

import fr.kata.bank.domain.exception.AccountNotFoundException;
import fr.kata.bank.domain.exception.OperationException;
import fr.kata.bank.domain.model.Account;
import fr.kata.bank.domain.model.enums.OperationType;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface AccountService {
    Account getAccount(String accountNumber) throws AccountNotFoundException;

    Account doOperation(String accountNumber, BigDecimal amount, LocalDateTime date, OperationType operationType) throws AccountNotFoundException, OperationException;
}
