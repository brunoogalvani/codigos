import javax.swing.JOptionPane;

public class Exercicio4 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        int nImp = 0; // Número de vezes que imprimiu
        int numero = 1;
        while (nImp < n) {
            if (numero % 2 == 1) {
                System.out.println(1 + nImp + "º - "+ numero);
                nImp++;
            }
            numero++;
        }
    }
}
