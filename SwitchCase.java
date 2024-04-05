import javax.swing.JOptionPane;

public class SwitchCase {
    public static void main(String[] args) {
        int nota = Integer.parseInt(JOptionPane.showInputDialog("Escreva a nota:"));
        switch(nota){
            case 10:
                JOptionPane.showMessageDialog(null, "Parabéns");
            case 9:
                JOptionPane.showMessageDialog(null, "Tirou A");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "Tirou B");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Tirou C");
                break;
            case 6:
            case 5:
                JOptionPane.showMessageDialog(null, "Recuperação");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Reprovado");
                break;
        }   
    }
}
