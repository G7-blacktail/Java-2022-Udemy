package areadotriangulo;

import javax.swing.JOptionPane;

public class AreaDoTriangulo{
    public static void main(String[] args){
        double area, altura, base;

        final int divisor = 2;

        String a = JOptionPane.showInputDialog("Digite o valor da altura");
            altura = Double.parseDouble(a.replace(",","."));
            System.out.println("Altura: " + altura + "cm²");
        String b = JOptionPane.showInputDialog("Digite o valor da base");
            base = Double.parseDouble(b.replace(",",","));  
            System.out.println("Base: " + base + "cm²");

        
        area = (base * altura) / divisor;

            System.out.println("O valor da base deste triangulo é " + area + "cm²");
    }
}