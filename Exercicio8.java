import javax.swing.JOptionPane;

public class Exercicio8 {
    public static void main(String[] args) {
        int numero =    Integer.parseInt(JOptionPane.showInputDialog("Digite um Numero"));
        switch (numero) {
            case 20:
                JOptionPane.showMessageDialog(null, "igual a 20");
                break;        
            default:
                if (numero > 20) {
                JOptionPane.showMessageDialog(null, "Maior que 20"); 
                } else {
                JOptionPane.showMessageDialog(null, "Menor que 20");
                }
        }
    }
}
