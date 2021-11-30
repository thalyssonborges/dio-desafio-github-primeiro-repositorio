package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex6_Fatorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Escolha um numero para saber o seu fatorial: ");
		int numeroFatorial = scan.nextInt();
		
		int fatorial = 1;
		
		//aprendi a utilizar o for decrementado o que tornou o fatorial muito mais fácil e compreensivel para determina-lo
		for(int i=numeroFatorial; i>=1; i--) {
			fatorial = fatorial * i;
		}
		System.out.println("Fatorial de "+numeroFatorial+" é: "+fatorial);
	}

}
