package de.gbsschulen.primesum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class PrimeCalculatorTest {
    private IPrimeCalculator primeCalculator;

    // Wird vor JEDEM Test ausgeführt
    @BeforeEach
    public void init(){
        // Arrange
        // TestDouble erstellen
        IPrimeChecker primeChecker = mock(IPrimeChecker.class);
        when(primeChecker.isPrime(0)).thenReturn(false);
        when(primeChecker.isPrime(1)).thenReturn(false);
        when(primeChecker.isPrime(2)).thenReturn(true);
        when(primeChecker.isPrime(3)).thenReturn(true);
        when(primeChecker.isPrime(4)).thenReturn(false);
        when(primeChecker.isPrime(5)).thenReturn(true);
        when(primeChecker.isPrime(6)).thenReturn(false);
        when(primeChecker.isPrime(7)).thenReturn(true);
        when(primeChecker.isPrime(8)).thenReturn(false);
        when(primeChecker.isPrime(9)).thenReturn(false);
        when(primeChecker.isPrime(10)).thenReturn(false);

        primeCalculator = new PrimeCalculator(primeChecker);
    }

    // Testfälle für sumAllNumbers
    @Test
    public void sumAllNumbers_0_shouldReturn_0(){
        // Act
        int result = primeCalculator.sumAllNumbers(0);

        // Assert
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void sumAllNumbers_1_shouldReturn_1(){
        // Act
        int result = primeCalculator.sumAllNumbers(1);

        // Assert
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void sumAllNumbers_2_shouldReturn_3(){
        // Act
        int result = primeCalculator.sumAllNumbers(2);

        // Assert
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void sumAllNumbers_10_shouldReturn_55(){
        // Act
        int result = primeCalculator.sumAllNumbers(10);

        // Assert
        assertThat(result).isEqualTo(55);
    }

    // Testfälle für sumPrimeNumber
    @Test
    public void sumPrimeNumber_0_shouldReturn_0(){
        assertThat(primeCalculator.sumPrimeNumber(0)).isEqualTo(0);
    }

    @Test
    public void sumPrimeNumber_1_shouldReturn_0(){
        assertThat(primeCalculator.sumPrimeNumber(1)).isEqualTo(0);
    }

    @Test
    public void sumPrimeNumber_2_shouldReturn_2(){
        assertThat(primeCalculator.sumPrimeNumber(2)).isEqualTo(2);
    }

    @Test
    public void sumPrimeNumber_3_shouldReturn_5(){
        assertThat(primeCalculator.sumPrimeNumber(3)).isEqualTo(5);
    }

    @Test
    public void sumPrimeNumber_10_shouldReturn_17(){
        assertThat(primeCalculator.sumPrimeNumber(10)).isEqualTo(17);
    }
}
