import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner tecl = new Scanner(System.in);
        System.out.println(" Digite um Número: ");
        int numero = tecl.nextInt();
        boolean ehprimo = true;
        for ( int i = 2; i < numero ; i++) {
               if (ehprimo = numero % i == 0) {
                    ehprimo = false;
                }
           //System.out.println( i );
        }
        if (ehprimo) {
            System.out.println("  É Primo. ");
        } else {
            System.out.println(" Não É Primo. ");
        }
        tecl.close();
    }
}
