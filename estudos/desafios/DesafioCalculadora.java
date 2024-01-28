package desafios;

import javax.swing.JOptionPane;

public class DesafioCalculadora {
    public static void main(String[] args) {
        
        String valor_1 = JOptionPane.showInputDialog("Digite o primeiro valor: ");
        double v1 = Double.parseDouble(valor_1);
        
        String operacao = JOptionPane.showInputDialog("Digite a operação desejada: ");

        String valor_2 = JOptionPane.showInputDialog("Digite o segundo valor: ");
        double v2 = Double.parseDouble(valor_2);

        double resultado = "+".equals(operacao)? v1 + v2 : 0;
        resultado = "-".equals(operacao)? v1 - v2 : resultado;
        resultado = "*".equals(operacao)? v1 * v2 : resultado;
        resultado = "/".equals(operacao)? v1 / v2 : resultado;
        resultado = "%".equals(operacao)? v1 % v2 : resultado;


        System.out.printf("%.2f %s %.2f = %.2f", v1, operacao, v2, resultado);
    }
}
