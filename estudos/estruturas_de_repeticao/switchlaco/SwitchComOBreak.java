package estruturas_de_repeticao.switchlaco;

public class SwitchComOBreak {
    
    public static void main(String[] args) {
        
        String conceito = "";
        int nota = 40;

        switch (nota) {
            case 10: case 9:
                conceito = "A";
                break;

            case 8: case 7:
                conceito = "B";
                break;

            case 6: case 5:
                conceito = "C";
                break;

            case 4: case 3:
                conceito = "D";
                break;

            case 2: case 1:
                conceito = "E";
                break;
        
            default:
                conceito = "Conceito nao encontrado";
                break;
        }

        System.out.println("Conceito é: " + conceito);
    }
}
