package services;

public class UsaInterestService implements InterestService{

    private double interestRate;

    public UsaInterestService(double interestRate) { // Construtor
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

}