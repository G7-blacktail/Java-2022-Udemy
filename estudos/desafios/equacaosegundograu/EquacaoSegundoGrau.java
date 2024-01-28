package equacaosegundograu;

import java.util.Scanner;

public class EquacaoSegundoGrau {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, c, delta;
            System.out.println("Equação: ax² + bx + c = 0");
		
		    System.out.println("\nDigite o valor de A: ");
        a = entrada.nextInt();
            System.out.println("\nDigite o valor de B: ");
        b = entrada.nextInt();
            System.out.println("\nDigite o valor de C: ");
        c= entrada.nextInt();

        entrada.close(); 

        delta = (int) Math.pow((b), 2) - (4 * a * c);

        //     System.out.println("O valor de Delta é: " + delta);
        System.out.printf("\nSua equação é: %dx² + %dx + %d = 0", a, b, c);
    
		System.out.println("\nO delta é: " + delta);

        double x1 = (-b + Math.sqrt(delta)) / (2 * a);

		System.out.printf("O x1 da equação é: %.2f", x1);

		double x2 = (-b - Math.sqrt(delta)) / (2 * a);

		System.out.printf("\nO x2 da equação é: %.2f" ,x2);

    }

}
