import javax.swing.JOptionPane;

public class DiaSemana {

    public static void main (String[]args) {
        int intDia;
        String strDia;
        strDia = JOptionPane.showInputDialog(null, "Digite um valor de 1 a 7");
        intDia = Integer.parseInt(strDia);
        switch (intDia) {
            
        case 1:
             JOptionPane.showMessageDialog(null, "Domingo", "Dia da Semana", JOptionPane.INFORMATION_MESSAGE);
             
             break;

        case 2:

            JOptionPane.showMessageDialog(null, "Segunda", "Dia da Semana", JOptionPane.INFORMATION_MESSAGE);

             break;

        case 3:  
            JOptionPane.showMessageDialog(null, "Terça", "Dia da Semana", JOptionPane.INFORMATION_MESSAGE);

            break;

        case 4:
            JOptionPane.showMessageDialog(null, "Quarta", "Dia da Semana", JOptionPane.INFORMATION_MESSAGE);

            break;

        case 5:
            JOptionPane.showMessageDialog(null, "Quinta", "Dia da Semana", JOptionPane.INFORMATION_MESSAGE);

            break;

        case 6:
            JOptionPane.showMessageDialog(null, "Sexta", "Dia da Semana", JOptionPane.INFORMATION_MESSAGE);

            break;

        case 7:
            JOptionPane.showMessageDialog(null, "Sabado", "Dia da Semana", JOptionPane.INFORMATION_MESSAGE);

            break;

        default:
        JOptionPane.showMessageDialog(null, "A semana te apenas 7 dias", "Dia da Semana", JOptionPane.INFORMATION_MESSAGE);

            break;

        }
    }

}    

