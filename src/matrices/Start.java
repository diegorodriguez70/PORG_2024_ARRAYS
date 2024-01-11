package matrices;

import java.util.Arrays;

public class Start {

	public static void main(String[] args) {
//		int temperaturas[] = new int [10];
//		temperaturas[0]=0;
//		temperaturas[1]=1;
//		temperaturas[2]=2;
//		temperaturas[3]=3;
//		temperaturas[4]=4;
//		temperaturas[5]=5;
//		temperaturas[6]=6;
//		temperaturas[7]=7;
//		temperaturas[8]=8;
//		temperaturas[9]=9;
//		System.out.println(temperaturas[2]);
//		System.out.println(Arrays.toString(temperaturas));
//		System.out.println(temperaturas.length);
//		
//	
		
		char frase[];
		frase=new char[10];
		frase[0]='h';
		frase[1]='o';
		frase[2]='l';
		frase[3]='a';
		frase[4]='-';
		frase[5]='L';
		frase[6]='u';
		frase[7]='y';
		frase[8]='D';
		frase[9]='.';
		
		for(int i=(frase.length-1);i>=0;i--) {
			System.out.print(frase [i]);
		}
		System.out.println();
		for( char letra:frase) {
			System.out.print(letra);
		}
	
		System.out.println(Arrays.toString(frase));
	}

}
