import javax.swing.JOptionPane;
public class ex0503 {
    public static void main(String[] args){
        int n = Integer.parseInt(JOptionPane.showInputDialog("digite n"));
        int mult = 1;
        for (int i=2, i<=n; i++) {
            mult *= i;
        }
        JOptionPane.showMessageDialog(null, "fatorial de " + n + " = " + mult, "Resultado", JOptionPane.INFORMATION_MESSAGE);

    }
    
}
