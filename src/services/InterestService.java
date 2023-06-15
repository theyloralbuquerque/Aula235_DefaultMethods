package services;

import java.security.InvalidParameterException;

public interface InterestService {

    double getInterestRate(); // Contrato

    default double payment(double amount, int months) { // Contrato
        if (months < 1) {
            throw new InvalidParameterException("Months must be greater than zero");
        }
        // retorne o valor * a potenciação de 1.0 + juros / 100, elevado ao valor de months.
        return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
    }
}