package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex5_Tabulada {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numeroTabuada;
		
		do {
			System.out.print("Qual tabuada você deseja saber?  ");
			numeroTabuada = scan.nextInt();
			
			if(numeroTabuada < 1 | numeroTabuada > 10) {
				System.out.println("Numero inválido, digite um numero entre 1 e 10.");
			}else {
				break;
			}
			
		}while(true);
		
		System.out.println("Tabuada do "+numeroTabuada+" selecionada!");
		
		for(int i=1 ; i<=10; i++) {
			System.out.println(numeroTabuada+" x "+i+" = "+numeroTabuada*i);

		}

	}

}
