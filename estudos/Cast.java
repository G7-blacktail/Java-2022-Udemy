public class Cast {
    public static void main(String[] args) {
               // convertendo tipos primitivos
        // Forma implicita
        String mensagem = "Passando os valores diretamente de: ";
        String byteParaLong = "byte para long\n";
        String LongParaInt = "long para int\n";
        String IntParaLong = "int para long\n";
        byte pequeno = 24;
        short medio = 0;
        int medioGrande = 0;
        long grande = 0;
            System.out.println("Valores:\n" + pequeno + "\n" + medio + "\n" + medioGrande + "\n" + grande);
            System.out.println(mensagem + byteParaLong);
                medio = pequeno;
            System.out.println(medio);

            System.out.println(mensagem + LongParaInt);
                medioGrande = medio;
            System.out.println(medioGrande);

            System.out.println(mensagem + IntParaLong);
               grande = medioGrande;
            System.out.println(grande);

            // de forma explicita (cast)

            double implicity = 1888554.555225556652;
                System.out.println(implicity); // esta conversão é implisita
            float explicity = (float) 50851.0555668875416552; // float explicity = 1.0F;
                System.out.println(explicity);

            int valor1 = 4;
            byte valor2 = (byte) valor1;
                System.out.println(valor2);
            valor1 = 3405;
            valor2 = (byte) valor1;
                System.out.println(valor2);
    }
}
