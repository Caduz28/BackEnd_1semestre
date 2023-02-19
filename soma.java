import javax.swing.JOptionPane;
public class soma {
    public static void main(String[] args) {
        double primeiroValor;
        double segundoValor;
        double resultado;
        primeiroValor =
Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
        segundoValor =
Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
        resultado = primeiroValor + segundoValor;
JOptionPane.showMessageDialog(null, "Soma: " + resultado);
    }
}