package desafiowhile;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double total = 0d;
        int numeroDeAlunos = 0;
        int exit = 0;

         while(exit != -1){
            double nota = 0;
            System.out.println("Insira a nota do aluno: ");
               nota = entrada.nextDouble();
            if( nota >= 0 && nota <= 10){
                numeroDeAlunos++;
                total += nota;
            } else if (nota == -1){
                System.out.println("Finalizado coleta de notas");
                exit = (int) nota;
            } else {
                System.out.println("Nota inválida");
            }

         }

         System.out.println("Numero de alunos da classe: " + numeroDeAlunos);

         double media = total / numeroDeAlunos;

         System.out.println("Media total da classe: " + media);


        entrada.close();
    }
}

