package br.com.dio.exercicios.loops;

/*
 Fa�a um programa que leia 5 n�meros
 e informe o maior n�mero
 e a m�dia desses n�meros 
 */
 

import java.util.Scanner;

public class Ex3_MaiorEMedia {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int contador=0;
		int maior=0;
		int soma=0;
		
		//aplicando maiores dificuldades no la�o de repeti��o while com la�o condicional if e else
		
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
		//aproveitando para aplicar os conhecimentos sobre casting, mesmo que o enunciado n�o tenha solicitado.
		System.out.println("Media: "+(double)soma/contador);
	}

}
