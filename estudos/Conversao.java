//import java.math.BigDecimal;

import javax.swing.JOptionPane;

public class Conversao {
    public static void main(String[] args) {
        Integer valor = 10000;
        int tamanho = valor.toString().length();
            System.out.println(valor.intValue());
        var algo = valor.compareTo(tamanho);
            System.out.println(tamanho);
            System.out.println(algo);

        int valor1 = 20000;
            System.out.println(Integer.toString(valor1));

        String texto1 = JOptionPane.showInputDialog(
            "digite o primeiro número:");
        String texto2 = JOptionPane.showInputDialog(
            "digite o segundo número");

            System.out.println(texto1 + " e " + texto2);
        double valorDouble = Double.parseDouble(texto1);
        double valorDouble1 = Double.parseDouble(texto2);
            System.out.println(valorDouble + valorDouble1);
    }
}
