package org.factoriaf5.exercisejavaimc;

public class ImcCalculator {
    
        private double weight = 0.0;
        private double height = 0.0;
    
        // Constructor para inicializar peso y estatura
        public calculateIMC(double weight, double height) {
            this.weight = weight;
            this.height = height;
        }
    
        // Método para calcular el IMC usando los atributos de la clase
        public double calculateIMC() {
            if (height <= 0) throw new IllegalArgumentException("La estatura debe ser mayor a cero.");
            return weight / Math.pow(height, 2);
        }
    
        // Método para clasificar el IMC
        public String classifyIMC(double imc) {
            if (imc < 18.5) {
                return "Bajo peso";
            } else if (imc >= 18.5 && imc < 24.9) {
                return "Peso normal";
            } else if (imc >= 25 && imc < 29.9) {
                return "Sobrepeso";
            } else {
                return "Obesidad";
            }
        }
}
    

