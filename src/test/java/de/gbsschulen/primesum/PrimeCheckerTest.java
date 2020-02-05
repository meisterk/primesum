package de.gbsschulen.primesum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class PrimeCheckerTest {
    IPrimeChecker primeChecker;

    @BeforeEach
    public void init(){
        // Arrange
        primeChecker = new PrimeChecker();
    }

    @Test
    public void iPrime_0_shouldReturn_false(){
        // Act + Assert
        assertThat(primeChecker.isPrime(0)).isFalse();
    }
    @Test
    public void iPrime_1_shouldReturn_false(){
        // Act + Assert
        assertThat(primeChecker.isPrime(1)).isFalse();
    }
    @Test
    public void iPrime_2_shouldReturn_true(){
        // Act + Assert
        assertThat(primeChecker.isPrime(2)).isTrue();
    }
    @Test
    public void iPrime_7_shouldReturn_true(){
        // Act + Assert
        assertThat(primeChecker.isPrime(7)).isTrue();
    }
    @Test
    public void iPrime_9_shouldReturn_false(){
        // Act + Assert
        assertThat(primeChecker.isPrime(9)).isFalse();
    }

}
