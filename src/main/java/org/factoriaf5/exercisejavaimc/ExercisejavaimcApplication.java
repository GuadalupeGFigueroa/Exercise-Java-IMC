package org.factoriaf5.exercisejavaimc;
import java.util.Scanner;


public class ExercisejavaimcApplication {

	public static void main(String[] args) {
				
        Scanner scanner = new Scanner(System.in);

        // Solicitar el peso y la altura al usuario
        System.out.print("Por favor, introduce tu peso en kilogramos: ");
        double weight = scanner.nextDouble();

        System.out.print("Por favor, introduce tu altura en metros: ");
        double height = scanner.nextDouble();

        // Crear una instancia de BMICalculator con los valores ingresados
        ImcCalculator imcCalculator = new ImcCalculator(weight, height);

        // Calcular el IMC y clasificarlo
        double imc = imcCalculator.calculateIMC();
        String classification = imcCalculator.classifyIMC(imc);

        // Mostrar los resultados
        System.out.printf("Tu IMC es: peso (km)/ altura2", imc);
        System.out.println("Clasificación del IMC: " + classification);

        // Cerrar el scanner
        scanner.close();
    }


	}


