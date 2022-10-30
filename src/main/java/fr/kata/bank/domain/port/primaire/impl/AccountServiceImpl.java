package fr.kata.bank.domain.port.primaire.impl;

import fr.kata.bank.domain.exception.AccountNotFoundException;
import fr.kata.bank.domain.exception.OperationException;
import fr.kata.bank.domain.model.Account;
import fr.kata.bank.domain.model.enums.OperationType;
import fr.kata.bank.domain.port.primaire.AccountService;
import fr.kata.bank.domain.port.primaire.OperationService;
import fr.kata.bank.domain.port.secondaire.AccountRepository;

import javax.inject.Named;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Named
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;
    private final OperationService operationService;

    public AccountServiceImpl(AccountRepository accountRepository, OperationService operationService) {
        this.accountRepository = accountRepository;
        this.operationService = operationService;
    }

    @Override
    public Account getAccount(String accountNumber) throws AccountNotFoundException {
        return accountRepository.findByAccountNumber(accountNumber).orElseThrow(() ->
                new AccountNotFoundException("The account " + accountNumber + " does not exist")
        );
    }

    @Override
    public Account doOperation(String accountNumber, BigDecimal amount, LocalDateTime date, OperationType operationType) throws AccountNotFoundException, OperationException {
        Account account = getAccount(accountNumber);
        switch (operationType) {
            case DEPOSIT:
                return accountRepository.save(account.deposit(accountNumber, amount, date));
            case WITHDRAW:
                return accountRepository.save(account.withdraw(accountNumber, amount, date));
            case CHECK:
                return accountRepository.findByAccountNumber(accountNumber)
                        .orElseThrow(() -> new AccountNotFoundException("The account " + accountNumber + " does not exist"));
            default:
                throw new OperationException("Unknown operation type");
        }
    }
}
