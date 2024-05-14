package org.example.dto;

import java.math.BigDecimal;

public record Customer(
        Long customerId,
        String customerName,
        BigDecimal investmentAmount
) {
}