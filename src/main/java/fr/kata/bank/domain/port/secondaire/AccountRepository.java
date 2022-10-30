package fr.kata.bank.domain.port.secondaire;

import fr.kata.bank.domain.exception.AccountNotFoundException;
import fr.kata.bank.domain.model.Account;

import java.util.Optional;
import java.util.stream.Stream;

public interface AccountRepository {

    Optional<Account> findByAccountNumber(String id) throws AccountNotFoundException;

    Account save(Account account);

    Stream<Account> findAll();
}
