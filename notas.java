import javax.swing.JOptionPane;
public class notas {
    public static void main(String[] args) {
        double n1;
        double n2;
        double n3;
        double resultado;
        n1 =
Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1: "));
        n2 =
Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2: "));
        n3 =
Double.parseDouble(JOptionPane.showInputDialog("digite a nota 3: "));
        resultado = (0.2*n1)+(0.3*n2)+(0.5*n3);
JOptionPane.showMessageDialog(null, "Media = " + resultado);
    }
}
