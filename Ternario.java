import javax.swing.JOptionPane;

public class Ternario {
 public static void main(String[] args) {
    int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade:"));
    String msg = (idade >= 18?"Pode":"Não Pode")+" Dirigir ";
    JOptionPane.showMessageDialog(null, msg );
}   
}
