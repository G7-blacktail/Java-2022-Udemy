package parentreos10;

import java.util.Scanner;

public class NumeroParEm_10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o número a ser verificado");
        int numero = entrada.nextInt();

            
                if(numero <= 10 && numero % 2 == 0){
                    System.out.printf("O número %d está dentro da intersecao 10 e é par", numero);
                }else if(numero > 10){
                    System.out.printf("O número %d nao esta dentro da intersecao 10", numero);
                } else if(numero <= 10 && numero % 2 != 0){
                    System.out.printf("O número %d está dentro da intersecao 10 e nao é par", numero);
                }
            

        entrada.close();
    }
}
