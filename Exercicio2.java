public class Exercicio2 {
    public static void main(String[] args) {
        for (int n = 1; n <= 40; n++){
            if (n % 4 == 0 || n % 10 == 0) {
                System.out.println("PIM");
            } else{
                System.out.println(n);
            }
        }
    }
}
