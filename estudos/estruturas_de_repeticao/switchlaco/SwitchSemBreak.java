package estruturas_de_repeticao.switchlaco;

import javax.swing.JOptionPane;

public class SwitchSemBreak {
    
    public static void main(String[] args) {

        String faixa = JOptionPane.showInputDialog("Digite a faixa: ");
        
        // String faixa = "preta";

        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("Sei o Bassai-dai...");
            case "marrom":
                System.out.println("Sei Tekki Shodan...");
            case "roxa":
                System.out.println("Sei Heidan Godan...");
            case "verde":
                System.out.println("Sei Heidan Yodan...");
            case "laranja":
                System.out.println("Sei Heidan Sandan...");
            case "vermelha":
                System.out.println("sei o Heidan Nidan...");
            case "amarela":
                System.out.println("Sei o Heidan Shodan...");
                break;
            default:
                System.out.println("Nao sei nada");
        }

        System.out.println("FIM!");

        int idade = 1;

        switch (idade) {
            case 3:
                System.out.println("Sabe programar");
            case 2:
                System.out.println("Sabe falar");
            case 1:
                System.out.println("Sabe andar");
            case 0:
                System.out.println("Saber respirar");
        }
    }
}
