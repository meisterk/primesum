package de.gbsschulen.primesum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class PrimeCalculatorTest {
    private IPrimeCalculator primeCalculator;

    // Wird vor JEDEM Test ausgeführt
    @BeforeEach
    public void init(){
        // Arrange
        primeCalculator = new PrimeCalculator();
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
}
