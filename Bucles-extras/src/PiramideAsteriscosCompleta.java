import java.util.Scanner;

/**
 * Imprimir por teclado piramide CENTRAL de n.asteriscos recogidos de teclado
 */

public class PiramideAsteriscosCompleta {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Inserte el numero de filas que quiere que contenga la piramide de asteriscos\n ");
		int n = teclado.nextInt();
		int i, j, k = 1;

		for (i = 1; i <= n; i++) {
			for (k =1; k <=n-i; k++) {
				System.out.printf(" ");
			}

			for (j = 1; j <= i; j++) {
				System.out.printf("* ");
			}
			System.out.println("");
		}
		teclado.close();

	}

}
