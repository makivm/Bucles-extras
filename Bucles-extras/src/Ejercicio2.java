/** 2.Generar los términos de la serie de fibonacci que sean menores que 1000.
 * */


public class Ejercicio2 {

	public static void main(String[] args) {

		int f=0;
		int t1=1;
		int t2=0;
		
		for(int i=1;i<=100 &&f<1000;i++) {
			t2 = f; 
			f=t1+f;
			t1 = t2;
			if (f<1000) 
			System.out.printf("%d ",f);
			
		}

	}

}
