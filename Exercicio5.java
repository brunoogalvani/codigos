import javax.swing.JOptionPane;

public class Exercicio5 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        //a e b são catetos, cé a hipotenusa
        for(int c = 1; c <= n; c++){
            boolean achou = false;
            for(int a = 1; a <= c && !achou; a++){
                int b = a;
                while (a*a + b*b < c*c) {
                    b++;
                }
                if (a*a + b*b == c*c) {
                    achou = true;
                    System.out.println("cateto 1 = " + a + " | cateto 2 = " + b + " | hipotenusa = " + c);
                }
            }
        }
    }
}
