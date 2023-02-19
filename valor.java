import javax.swing.JOptionPane;

public class valor {

    public static void main (String args[]) {

        int valor;
        int qtd_nota200;
        int qtd_nota100;
        int qtd_nota50;
        int qtd_nota20;
        int qtd_nota10;
        int qtd_nota5;
        int qtd_nota2;
        int qtd_nota1;

        System.out.println("Informe um valor");
        valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));

        qtd_nota200 = valor / 200;
        valor = valor - (qtd_nota200*200);

        qtd_nota100 = valor / 100;
        valor = valor - (qtd_nota100*100);

        qtd_nota50 = valor / 50;
        valor = valor - (qtd_nota50*50);

        qtd_nota20 = valor / 20;
        valor = valor - (qtd_nota20*20);

        qtd_nota10 = valor / 10;
        valor = valor - (qtd_nota10*10);

        qtd_nota5 = valor / 5;
        valor = valor - (qtd_nota5*5);

        qtd_nota2 = valor / 2;
        valor = valor - (qtd_nota2*2);

        qtd_nota1 = valor / 1;
        valor = valor - (qtd_nota1);

        System.out.println("Notas de 200:" + qtd_nota200);
        System.out.println("Notas de 100:" + qtd_nota100);
        System.out.println("Notas de 50:" + qtd_nota50);
        System.out.println("Notas de 20:" + qtd_nota20);
        System.out.println("Notas de 10:" + qtd_nota10);
        System.out.println("Notas de 5:" + qtd_nota5);
        System.out.println("Notas de 2:" + qtd_nota2);
        System.out.println("Notas de 1:" + qtd_nota1);


         } 

    }
   
