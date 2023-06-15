package services;

import java.security.InvalidParameterException;

public class BrazilInterestService {

    private double interestRate;

    public BrazilInterestService(double interestRate) { // Construtor
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double payment(double amount, int months) { // M�todo que retorna valor o pagamento ap�s a quantidade de meses informada.
        if (months < 1) {
            throw new InvalidParameterException("Months must be greater than zero");
        }
        // retorne o valor * a potencia��o de 1.0 + juros / 100, elevado ao valor de months.
        return amount * Math.pow(1.0 + interestRate / 100.0, months);
    }
}