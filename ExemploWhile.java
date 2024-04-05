import javax.swing.JOptionPane;

public class ExemploWhile {
    public static void main(String[] args) {
        double nota1, nota2;
        int contador = 1;
        while (contador <= 10 ){
            nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a Primeira Nota"));
            nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a Segunda Nota"));
            JOptionPane.showMessageDialog(null,"Media:"+(nota1+nota2)/2);
            contador = contador + 1;
        }
    }
}