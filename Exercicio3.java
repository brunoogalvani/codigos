import javax.swing.JOptionPane;

public class Exercicio3 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        double soma = 0;
        for(double k = 1; k <= n; k++){
            soma = soma + 1 / k;
        }
        System.out.println(soma);
    }
}
