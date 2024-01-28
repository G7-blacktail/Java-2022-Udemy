package ConverterFahrenheit;

import javax.swing.JOptionPane;

public class ConversorTemperatura {
    
    final static float initialConst = 1.8F;
    final static int initialInit = 32;
    
    public static void main(String[] args) {

        float fahernheint, celsius, resultado;

        String valor1 = JOptionPane.showInputDialog("Digite o valor na escala Fahernheint: ");
        fahernheint = Float.parseFloat(valor1);
            System.out.println("Valor: " + valor1 + "°");

        String valor2 = JOptionPane.showInputDialog("Digite o valor na escala Celsius: ");
        celsius = Float.parseFloat(valor2);
            System.out.println("Valor " + valor2 + "°");

        resultado = converterParaCelsius(fahernheint);
            System.out.printf("Resultado da conversão para Celcius: %.2f° \n", resultado);
        resultado = converterParaFahrenheint(celsius);
            System.out.printf("Resultado da conversão para Fahrenheint: %.2f° \n", resultado);
        
    }


    private static float converterParaFahrenheint(float celsius){
        float fahernheint = celsius * initialConst + initialInit;
        return fahernheint;
    }

    private static float converterParaCelsius(float fahernheint){
        float celsius = (fahernheint - initialInit) / initialConst;
        return celsius;
    }
}
