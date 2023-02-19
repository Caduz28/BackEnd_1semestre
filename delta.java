import javax.swing.JOptionPane;

public class delta {
    public static void main (String[] args) {
        double a, b, c; //coeficiente da equação
        double  delta; //determinante]
        double x1, x2; //raizes
        //entrada dos dados
        a = Double.parseDouble(JOptionPane.showInputDialog("digite o coeficiente a"));
        b = Double.parseDouble(JOptionPane.showInputDialog("digite o coeficiente b"));
        c = Double.parseDouble(JOptionPane.showInputDialog("digite o coeficiente c"));
        if (a !=0) {

        }
        else{
            JOptionPane.showMessageDialog(null, "Nao e equacao do 2 grau");
        }
    }

    
}