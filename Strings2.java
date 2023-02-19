import java.util.Scanner;
public class Strings2 {
    public static void main(String[] args) {
        String nome = "Andreia";
        int tamanho =  nome.length();
        System.out.println( nome + " tem " + tamanho + " caracteres ");

        //declarar EEE instanciar um objeto da classe Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite sua idade");
        int idade = scanner.nextInt ();
        System.out.println("digite seu peso");
        double peso = scanner.nextDouble();

        System.out.println(String.format("me chamo %s, tenho %d anos e peso %.2f quilos", nome, idade, peso));        
        
        System.out.println("digite a primeira string");
        String s1 = scanner.next();
        System.out.println("digite outra");
        String s2 = scanner.nextLine();
        System.out.println("digite mais uma");
        String s3 = scanner.next();

        System.out.println(String.format("s1 = %s\ns2 = %s\ns3 = %s", s1, s2, s3));

        //libera a memória
        scanner.close();

    }    
}
    

