package fr.kata.bank.domain.model;

import lombok.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Account {

    private String Id;
    private BigDecimal balance;
    private List<Operation> operations = new ArrayList<>();

}
