package de.gbsschulen.primesum;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void shouldBeEqual(){
        assertThat(3).isEqualTo(3);
    }

    @Test
    public void irgendwas(){
        Rechner rechnerMock = mock(Rechner.class);
        when(rechnerMock.isPrime(3)).thenReturn(true);

    }
}
