package fr.kata.bank.domain.port.primaire;


import fr.kata.bank.domain.model.Account;
import io.cucumber.java8.En;
import io.cucumber.java8.PendingException;

import javax.validation.Validator;
import java.math.BigDecimal;

import static javax.validation.Validation.buildDefaultValidatorFactory;

public class AccountStepDefinition implements En {

    private final Validator validator = buildDefaultValidatorFactory().getValidator();

    private final AccountService accountService = null; //TODO
    private Account account;

    public AccountStepDefinition() {

        Given("^I check my account balance", (String id) -> {
            throw new PendingException();
        });

        Given("^I deposit {bigDecimal} euros in my account {string}$", (BigDecimal credit, String id) -> {
            throw new PendingException();
        });

        Given("^I withdraw {bigDecimal} euros from my account {id}$", (String id, BigDecimal debit) -> {
            throw new PendingException();
        });

        When("^I check the balance of my account {string}$", (String id) -> {
            throw new PendingException();
        });

        Then("^My balance should be {bigDecimal}", (BigDecimal expectedBalance) -> {
            throw new PendingException();
        });
    }
}
