/** 1.Obtener los 100 primeros términos de la serie de fibonacci. (0  1  1  2  3  5  8  13  21..)
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int f=0;
		int t1=1;
		int t2;
		
		for(int i=1;i<=100;i++) {
			t2 = f; 
			f=t1+f;
			t1 = t2;
			System.out.printf("%d ",f);
		}	

	}

}
