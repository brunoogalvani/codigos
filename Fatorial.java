import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um Numero: ");
        int n = sc.nextInt();
        // ir multiplicando um numero de 2 ate n,
        // guardando o resultado
        int resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado = resultado * i;
        }
        // imprimir o resultado
         System.out.println(resultado);
        sc.close();
     }
}
