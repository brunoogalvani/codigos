import javax.swing.JOptionPane;

public class Exercicio6 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de n:"));
        int m = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de m:"));
        int maximo = 0;
        int xMaximo = 0;
        int yMaximo = 0;

        for(int x = 0; x <= n; x++){
            for(int y = 0; y <= m; y++){
                // System.out.println("(" + x + ", " + y + ")");
                //x.y - x^2 + y
                int expressao = x * y - (x * x) + y;
                if (expressao > maximo) {
                    maximo = expressao;
                    xMaximo = x;
                    yMaximo = y;
                }
                System.out.println("(" + x + ", " + y + ") = " + expressao);
            }
        }
        System.out.println("Máximo: (" + xMaximo + ", " + yMaximo + ") = " + maximo);
    }
}
