import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class TemperatureConverterTest {
    TemperatureConverter converter;
    @BeforeEach
    void setUp() {
        this.converter = new TemperatureConverter();

    }


    @Test
    void fahrenheitToCelsius() {
        assertEquals(0, converter.fahrenheitToCelsius(32));
        assertEquals(32.222222222222222, converter.fahrenheitToCelsius(90));
    }

    @Test
    void celsiusToFahrenheit() {
        assertEquals(212, converter.celsiusToFahrenheit(100));
        assertEquals(-130, converter.celsiusToFahrenheit(-90));
        assertEquals(32, converter.celsiusToFahrenheit(0));
    }

    @Test
    void isExtremeTemperature() {
        assertFalse(converter.isExtremeTemperature(32));
        assertTrue(converter.isExtremeTemperature(90));
    }
}