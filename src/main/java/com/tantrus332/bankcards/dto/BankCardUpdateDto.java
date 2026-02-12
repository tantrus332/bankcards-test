package com.tantrus332.bankcards.dto;

import java.math.BigDecimal;
import java.time.YearMonth;

import com.tantrus332.bankcards.util.BankCardStatus;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
public class BankCardUpdateDto {
    private String cardNumber;

    @NotNull
    private YearMonth expirationDate;

    @NotNull
    private Long userId;

    @NotNull
    private BigDecimal balance;
}
