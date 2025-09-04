import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    TemperatureConverter converter = new TemperatureConverter();

    @org.junit.jupiter.api.Test
    void fahrenheitToCelsius() {
        assertEquals(0, converter.fahrenheitToCelsius(32));
        assertEquals(32.22222222222222, converter.fahrenheitToCelsius(90));
    }

    @org.junit.jupiter.api.Test
    void celsiusToFahrenheit() {
        assertEquals(212, converter.celsiusToFahrenheit(100));
        assertEquals(-130, converter.celsiusToFahrenheit(-90));
        assertEquals(32, converter.celsiusToFahrenheit(0));
    }

    @org.junit.jupiter.api.Test
    void isExtremeTemperature() {
        assertFalse(converter.isExtremeTemperature(32));
        assertTrue(converter.isExtremeTemperature(90));
    }
}