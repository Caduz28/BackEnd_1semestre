import javax.swing.JOptionPane;

public class Sistema {
    public static void main(String[] args) {
        double nota;
        nota = Double.parseDouble(JOptionPane.
        showInputDialog("digite sua nota"));
        if (nota >= 70) {
            JOptionPane.showMessageDialog(null, "Aprovado");
        }
        else {
            JOptionPane.showMessageDialog(null, "Estudar mais");
        }
    }
}