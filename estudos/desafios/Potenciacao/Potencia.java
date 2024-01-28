package Potenciacao;

import javax.swing.JOptionPane;

public class Potencia {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Valor a ser calculado: ");
        float v1 = Float.parseFloat(valor.replace(",", "."));

        float quadrado = v1 * v1; // resolução analogica
        float quadradoMath = (float) Math.pow(v1, 2); // Usando Math

        float cubo = v1 * v1 * v1; // resolução analogica
        float cuboMath = (float) Math.pow(v1, 3);

            System.out.println("Respostas:");
            System.out.println("Valor ao quadrado: " + quadrado);
            System.out.println("Usando Math: " + quadradoMath);
            System.out.println("Valor ao cubo: " + cubo);
            System.out.println("Usando Math: " + cuboMath);
    }
}
