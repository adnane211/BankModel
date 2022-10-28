package fr.kata.bank.domain.port.primaire;


import fr.kata.bank.domain.model.Account;
import io.cucumber.java8.En;
import io.cucumber.java8.PendingException;

import javax.validation.Validation;
import javax.validation.Validator;
import java.math.BigDecimal;

public class AccountStepDefinitions implements En {

    private final Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

    private final AccountService accountService = null;

    private Account account;

    public AccountStepDefinitions() {

        Given("I check my account {string} balance", (String id) -> {
            throw new PendingException();
        });

        When("I check the balance of the account {string}", (String id) -> {
            throw new PendingException();
        });

        Then("My balance should be {bigDecimal}", (BigDecimal balance) -> {
            throw new PendingException();
        });

    }
}
