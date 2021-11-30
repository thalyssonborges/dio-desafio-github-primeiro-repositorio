package br.com.dio.exercicios.loops;

/*
 Faça um programa que leia 5 números
 e informe o maior número
 e a média desses números 
 */
 

import java.util.Scanner;

public class Ex3_MaiorEMedia {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int contador=0;
		int maior=0;
		int soma=0;
		
		//aplicando maiores dificuldades no laço de repetição while com laço condicional if e else
		
		do {
			System.out.print("Numero("+(contador+1)+"): ");
			numero = scan.nextInt();
			if(numero < 0 | numero > 10) {
				System.out.println("Numero Invalido, Tente Novamente!");
			}else {
				soma += numero; 
				contador++;				
				if(numero>maior) maior = numero;
			}
				
		}while(contador < 5);

		System.out.println("Maior: "+maior);
		//aproveitando para aplicar os conhecimentos sobre casting, mesmo que o enunciado não tenha solicitado.
		System.out.println("Media: "+(double)soma/contador);
	}

}
