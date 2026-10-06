
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double nota, soma, media;

        for (int i = 1; i == 1;) {
            soma = 0;

            for (int j = 0; j < 2;) {
                nota = leia.nextDouble();

                if (nota >= 0 && nota <= 10) {
                    soma += nota;
                    j++;
                } else {
                    System.out.println("nota invalida");
                }
            }
            media = soma / 2.0;
            System.out.printf("media = %.2f\n", media);

            for (int k = 0; k == 0;) {
                System.out.println("novo calculo (1-sim 2-nao)");
                i = leia.nextInt();

                if (i == 1 || i == 2) {
                    k = 1;
                }
            }
        }
    }
}
