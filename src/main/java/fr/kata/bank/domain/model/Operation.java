package fr.kata.bank.domain.model;

import fr.kata.bank.domain.model.enums.OperationType;
import lombok.*;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Operation {

    private String id;
    private BigDecimal amount;
    private Instant date;
    private OperationType operationType;


}
