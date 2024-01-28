package IMC;

import javax.swing.JOptionPane;

public class IMC {
    static double altura, peso, resultado;

    public static void main(String[] args) {
        String v1 = JOptionPane.showInputDialog("Digite o valor do peso: ");
            peso = Double.parseDouble(v1.replace(",", "."));
        String v2 = JOptionPane.showInputDialog("Digite o valor da altura");
            altura = Double.parseDouble(v2.replace(",", "."));

        resultado = formulaImcCalcular(peso, altura);

        String imc = resultado < 18.5 ? "Magreza" : "Não identificado";
        imc = resultado > 18.5 && resultado <  24.9 ? "Normal" : imc;
        imc = resultado > 25 && resultado < 29.9 ? "Sobrepeso" : imc;
        imc = resultado > 30 && resultado < 39.9 ? "Obesidade" : imc;
        imc = resultado > 40 ? "Obesidade Grave" : imc;

         System.out.println("O Resultado do seu Indice de Massa Cormporal é : " + imc);
        
    }

    private static double formulaImcCalcular(double peso, double altura){
        double resultado = peso/(Math.pow(altura, 2));
        return resultado;
    }
}
