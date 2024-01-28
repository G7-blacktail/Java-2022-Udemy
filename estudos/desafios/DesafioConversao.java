package desafios;

import java.util.Scanner;
// import java.util.Locale;
// import javax.swing.JOptionPane;

public class DesafioConversao {
    public static void main(String[] args) {
        // Locale.setDefault(new Locale("en", "US"));
        Scanner entrada = new Scanner(System.in);

        String salarioJaneiro, salarioFevereiro, salarioMarco;
        // salarioJaneiro = JOptionPane.showInputDialog("Digite o valor do salário de Janeiro");
        // salarioFevereiro = JOptionPane.showInputDialog("Digite o valor do salário de Fevereiro");
        // salarioMarco = JOptionPane.showInputDialog("Digite o valor do salário de Março");
        System.out.println("Informe o salário de Janeiro: ");
        salarioJaneiro = entrada.nextLine();
        System.out.println("\nInforme o Salário de Fevereiro: ");
        salarioFevereiro = entrada.nextLine();
        System.out.println("\nInforme o salário de Março: ");
        salarioMarco = entrada.nextLine();

        double janeiro = Double.parseDouble(salarioJaneiro.replace(",","."));
        double fevereiro = Double.parseDouble(salarioFevereiro.replace(",","."));
        double marco = Double.parseDouble(salarioMarco.replace(",","."));

            System.out.println("Janeiro: " + salarioJaneiro + "\nFevereiro: " + salarioFevereiro + "\nMarço: " + salarioMarco);
        
        double media = (janeiro + fevereiro + marco)/ 3;
        String resultado = Double.toString(media).replace(".",",");
            
        System.out.println("Valor da média dos salários do funcionário: " + resultado);
        

        entrada.close();
    }
}
