package services;

public class BrazilInterestService implements InterestService{

    private double interestRate;

    public BrazilInterestService(double interestRate) { // Construtor
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

}