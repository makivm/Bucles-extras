
/** Programa que muestra reloj 24h
 */

import java.util.concurrent.TimeUnit;
 
public class Reloj24H {

	public static void main(String[] args) throws InterruptedException {
		int horas, minutos, segundos = 0;
		String borrar="\b\b\b\b\b\b\b\b";

		for (horas = 0; horas <24; horas++) {
			for (minutos =0; minutos <60; minutos++) {
				for (segundos = 0; segundos< 60; segundos++) {
					System.out.printf("%02d:%02d:%2d",horas,minutos,segundos);
					TimeUnit.MILLISECONDS.sleep(1);
					System.out.print(borrar);
				}
			}
		}
	}
}
