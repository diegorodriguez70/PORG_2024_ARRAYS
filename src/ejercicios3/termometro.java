package ejercicios3;

import java.util.Arrays;

public class termometro {
	private int mes;
	private float temperatura[];
	private int dias;

	private void temperaturaMeses(int mes) {
		int i = 1;
		while (i < dias) {
			if (mes==1 | mes ==2 |mes==12) {
				this.temperatura[(dias - dias) + i] = (float) (Math.random()*15)-5;
			}
			if (mes==3 | mes==4 | mes==5 | mes==9 | mes==10 |mes==11) {
				this.temperatura[(dias - dias) + i] = (float) (Math.random()*15)+5;
			}
			if (mes==6 | mes ==7 | mes==8) {
				this.temperatura[(dias - dias) + i] = (float) (Math.random()*20)+15;
			}
			//this.temperatura[(dias - dias) + i] = (float) (Math.random()*20);
			i++;
		}
	}

	private void diasMes(int mes) {
		this.dias = 0;
		this.mes = mes;
		if (mes == 1 | mes == 3 | mes == 5 | mes == 7 | mes == 8 | mes == 10 | mes == 12) {
			// float temperatura[] = new float[i];
			// this.temperatura = temperatura;
			dias = 31;
		}
		if (mes == 2) {
//				float temperatura[] = new float[28];
//				this.temperatura = temperatura;
			dias = 28;
		}
		if (mes == 4 | mes == 6 | mes == 9 | mes == 11) {
//					float temperatura[] = new float[30];
//					this.temperatura = temperatura;
			dias = 30;
		}
		float temperatura[] = new float[dias];
		this.temperatura = temperatura;
	}

	public termometro(int mes) {
		// float temperatura[];
		this.diasMes(mes);
		this.temperaturaMeses(mes);

	}
	
	public float temperaturaMedia() {
		
		int i =0;
		float suma=0;
		while (i<dias) {
			 suma=suma+ temperatura[(dias-dias)+i];
			 i++;
		}
		return suma/dias;
	}
	
	
	public float temperaturaMaxima() {
		float maxima=-9999;
		int i =0;
		while (i<dias) {
			if (temperatura[((dias-dias)+i)]>maxima) {
				maxima=temperatura[(dias-dias)+i];
			}
			i++;
		}
		return maxima;
	}
	public float temperaturaMinima() {
		float minima=9999;
		int i=0;
		while (i<dias) {
			if (temperatura[((dias-dias)+i)]<minima) {
				minima=temperatura[(dias-dias)+i];
			}
			i++;
		}
		return minima;
	}
	
	public float tempImpares() {
		
		int i =0;
		float impares[]=new float[dias];
		while (i%2==0 & i<dias) {
			impares[i]= temperatura[(dias-dias)+i];
			i=i+2;
		}
		float maxima = -9999;
		i=0;
		while (i<dias) {
			if (impares[((dias-dias)+i)]>maxima) {
				maxima=impares[(dias-dias)+i];
			}
			i++;
		}
		return maxima;
	}
	
	
	public float tempPares() {
		
		int i =1;
		float impares[]=new float[dias];
		while (i%2!=0 & i<dias) {
			impares[i]= temperatura[(dias-dias)+i];
			i=i+2;
		}
		float maxima = -9999;
		i=0;
		while (i<dias) {
			if (impares[((dias-dias)+i)]>maxima) {
				maxima=impares[(dias-dias)+i];
			}
			i++;
		}
		return maxima;
	}
	
	public float MediaImpares() {
		int i =1;
		float impares[]=new float[dias];
		int diasImpares=0;
		int diasTotal = this.dias;
		while (((diasTotal-diasTotal)+i)!=2 & i<diasTotal) {
			diasImpares++;
			i=i+2;
		}
		i=0;
		while (i%2==0 & i<dias) {
			impares[i]= temperatura[(dias-dias)+i];
			i=i+2;
		}
		
		i=0;
		i =0;
		float suma=0;
		while (i<dias) {
			 suma=suma+ impares[(dias-dias)+i];
			 i++;
		}
		return suma/diasImpares;
	
	}
	
	public String toString() {
		return Arrays.toString(temperatura);
	}
}
