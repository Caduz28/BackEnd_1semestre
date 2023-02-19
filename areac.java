import javax.swing.JOptionPane;
public class areac {
    public static void main(String[] args) {
        double r;
        double resultado;
        r =
Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio: "));
        resultado = Math.PI*r*r;
JOptionPane.showMessageDialog(null, "Area do circulo = " + resultado);
    }   
}
