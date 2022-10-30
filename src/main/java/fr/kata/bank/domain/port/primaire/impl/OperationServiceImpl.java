package fr.kata.bank.domain.port.primaire.impl;

import fr.kata.bank.domain.exception.OperationException;
import fr.kata.bank.domain.model.Operation;
import fr.kata.bank.domain.model.enums.OperationType;
import fr.kata.bank.domain.port.primaire.OperationService;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OperationServiceImpl implements OperationService {

    @Override
    public void operate(String accountNumber, BigDecimal balance, BigDecimal amount, LocalDateTime dateTime, OperationType operationType) throws OperationException {
        Operation operation = new Operation(accountNumber, balance, amount, dateTime, operationType);
        operation.operate();
    }
}
