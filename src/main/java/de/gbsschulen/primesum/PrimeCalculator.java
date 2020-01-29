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
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }
}
