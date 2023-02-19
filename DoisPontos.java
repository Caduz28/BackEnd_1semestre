import javax.swing.JOptionPane;
public class DoisPontos {
    public static void main(String args[]) {
        double x1;
        double y1;
        double x2;
        double y2;
        double resultado;
        x1 =
Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de x1"));
        y1 =
Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de y1"));
        x2 = 
Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de x2"));
        y2 =
Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de y2"));
        resultado = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
JOptionPane.showMessageDialog(null, "Distancia entre p1 e p2 = " + resultado);
    }
}