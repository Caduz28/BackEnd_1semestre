import javax.swing.JOptionPane;
public class ex0402 {
    public static void main(String[] args){
        String senha = JOptionPane.showInputDialog("digite uma senha");
        if (senha.length() == 4){
            if (senha.charAt(0) == 'a'|| senha.charAt(0) == 'A') {
                boolean contemImpar = false;
                for (int posicao = 1; posicao < senha.length() && !contemImpar; posicao++) {
                    int numero = Integer.parseInt (senha.substring(posicao, posicao + 1));
                    if (numero % 2 == 1) {
                        contemImpar = true;
                    }

                }
                if (contemImpar) {
                    JOptionPane.showMessageDialog(null, "bem-vindo", "senha valida", JOptionPane.INFORMATION_MESSAGE);

                }
                else {
                    JOptionPane.showMessageDialog(null, "Nao ha numeros impares", "senha invalida", JOptionPane.WARNING_MESSAGE);
                }

            }
            else {
                JOptionPane.showMessageDialog(null, "senha nao inicia com a/A", "senha invalida", JOptionPane.WARNING_MESSAGE);
            }

        }
        else {
            JOptionPane.showMessageDialog(null, "Tamanho nao e 4", "senha invalida", JOptionPane.WARNING_MESSAGE);
        }
    }
    
}
