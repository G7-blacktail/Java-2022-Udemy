package estruturas_de_repeticao.break_continue;

public class ContinueRotulado {
    public static void main(String[] args) {
        externo: for(int i = 0; i < 3; i++){ //rotulando um laço para o break agir nele
            for(int j = 0; j < 3; j++){

                if(i == 1) continue externo;

                System.out.printf("[%d , %d] ", i, j);
            }
            System.out.println();
        }

        System.out.println("Fim");
    }
}
