package de.gbsschulen.primesum;

public class PrimeCalculator implements IPrimeCalculator {
    @Override
    public int sumPrimeNumber(int number) {
        return 0;
    }

    @Override
    public int sumNotPrimeNumber(int number) {
        return 0;
    }

    @Override
    public int sumAllNumbers(int number) {
        int sum = ((number + 1) * number) / 2;
        return sum;
    }
}
