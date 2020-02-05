package de.gbsschulen.primesum;

public class PrimeCalculator implements IPrimeCalculator {
    private IPrimeChecker primeChecker;

    public PrimeCalculator(IPrimeChecker primeChecker) {
        this.primeChecker = primeChecker;
    }

    @Override
    public int sumPrimeNumber(int number) {
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            if(primeChecker.isPrime(i)){
                sum += i;
            }
        }
        return sum;
    }

    @Override
    public int sumNotPrimeNumber(int number) {
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            if(!primeChecker.isPrime(i)){
                sum += i;
            }
        }
        return sum;
    }

    @Override
    public int sumAllNumbers(int number) {
        int sum = ((number + 1) * number) / 2;
        return sum;
    }
}
