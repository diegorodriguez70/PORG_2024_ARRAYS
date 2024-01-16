package ejercicios3;

import java.util.Arrays;

public class Start {

	public static void main(String[] args) {
		termometro termometro1 = new termometro(6);
		System.out.println(termometro1);
		float media=termometro1.temperaturaMedia();
		float maxima=termometro1.temperaturaMaxima();
		float minima=termometro1.temperaturaMinima();
		System.out.println("La temperatura media del mes es ---->"+" "+media);
		System.out.println("La temperatura maxima del mes es --->"+" "+maxima);
		System.out.println("La temperatura minima del mes es --->"+" "+minima);
		float imparesMAX= termometro1.tempImpares();
		System.out.println("La temperatura maxima de los dias impares del mes es "+imparesMAX);
		float paresMAX = termometro1.tempPares();
		System.out.println("La temperatura maxima de los dias pares del mes es "+paresMAX);
		float mediaImpares = termometro1.MediaImpares();
		System.out.println("La temperatura media de los dias impares es " +mediaImpares);
		float quincena=termometro1.Minima(1);
		System.out.println(quincena);
	}

}
