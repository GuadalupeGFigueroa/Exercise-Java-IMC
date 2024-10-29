package org.factoriaf5.exercisejavaimc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ImcCalculatorTest {

    @Test
    public void testCalculateIMC() {
        double weight = 70; // kg
        double height = 1.75; // metros
        double expectedIMC = 22.86;

        // Llama al método estático de calculateIMC
        assertEquals(expectedIMC, ImcCalculator.calculateIMC(weight, height), 0.01);
    }

    @Test
    public void testClasificarIMC() {
        assertEquals("Bajo peso", ImcCalculator.classifyIMC(17.0));
        assertEquals("Peso normal", ImcCalculator.classifyIMC(22.0));
        assertEquals("Sobrepeso", ImcCalculator.classifyIMC(27.0));
        assertEquals("Obesidad", ImcCalculator.classifyIMC(32.0));
    }

    @Test
    public void testCalcularIMCConEstaturaCero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            ImcCalculator.calculateIMC(70, 0);
        });

        assertEquals("La estatura debe ser mayor a cero.", exception.getMessage());
    }
}

    
        
