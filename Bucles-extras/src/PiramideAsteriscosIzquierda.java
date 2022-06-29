import java.util.Scanner;

/** Imprimir por teclado piramide de n.asteriscos recogidos de teclado de manera que, si n=10:
 * 
 **
 ***
 ****
 *****
 ******
 *******
 ********
 *********
 **********
 */
public class PiramideAsteriscosIzquierda {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Inserte el numero de filas que quiere que contenga la piramide de asteriscos\n ");
		int n=teclado.nextInt();
		int i,j=1;
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		teclado.close();

	}

}
