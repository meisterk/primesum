package de.gbsschulen.primesum;

public class PrimeChecker implements IPrimeChecker{
    @Override
    public boolean isPrime(int number) {
        if(number<2){
            return false;
        }

        for (int i = 2; i < number; i++) {
            if(number%i == 0){
                return false;
            }
        }
        return true;
    }
}
