package org.factoriaf5.exercisejavaimc;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ImcCalculatorTest { 

    ImcCalculator imcCalculator = new ImcCalculator();

    @Test
    public void testCalcularIMC() {
        double weight = 70; // kg
        double height = 1.75; // metros
        double expectedIMC = 22.86;
        
        // Comprobación con un margen de error (delta) debido a posibles diferencias en precisión
        assertEquals(expectedIMC, imcCalculator.calculateIMC(weight, height), 0.01);
    }

    @Test
    public void testClasificarIMC() {
        assertEquals("Bajo peso", imcCalculator.classifyIMC(17.0));
        assertEquals("Peso normal", imcCalculator.classifyIMC(22.0));
        assertEquals("Sobrepeso", imcCalculator.classifyIMC(27.0));
        assertEquals("Obesidad", imcCalculator.classifyIMC(32.0));
    }
    
    @Test
    public void testCalcularIMCConEstaturaCero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            imcCalculator.calculateIMC(70, 0);
        });
        
        assertEquals("La estatura debe ser mayor a cero.", exception.getMessage());
    }
}

    
        
