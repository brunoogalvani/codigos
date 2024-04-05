import javax.swing.JOptionPane;

public class Exercicio6ifanin {
    public static void main(String[] args) {
        int a, b, c;
        String saida = "Entrada inválida";
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número"));
        if (a < b) {
            if (b < c){
                saida = a+", "+b+", "+c;
            } else {
                if (c < a) {
                    saida = c+", "+a+", "+b;
                } else {
                    saida = a+", "+c+", "+b;
                }
            }
        }
        else {
            if (a < c){
                saida = b+", "+a+", "+c;
            } else {
                if (b < c){
                    saida = b+", "+c+", "+a;
                } else {
                    saida = c+", "+b+", "+a;
                }
            }
        }
        JOptionPane.showMessageDialog(null, saida);
    }
}
