public class Testaconversao {
    public static void main(String [] args) {
        double valor1 = 1274.90;
        System.out.println("O salario de Tancredo sera: " + valor1);

            double valor2 = (int) 1350;
            System.out.println("O salario de Afonso sera: " + valor2);

            System.out.println("O total de salario deles sera: " + (valor1 + valor2));

            double horaextra1 = 179.90;
            double horaextra2 = 265.93;

            System.out.println("O valor de hora extra dos 2 sera: " + (horaextra1 + horaextra2));

            System.out.println("Tancredo e Afonso receberam juntos no final do mes um total de: " + (valor1 + valor2 + horaextra1 + horaextra2));
        
    }
    
}
