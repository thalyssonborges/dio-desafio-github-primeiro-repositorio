package br.com.dio.exercicios.loops;

/*
 Fa�a um program que pe�a N n�meros inteiros,
 calcule e mostre a quantidade de n�meros pares
 e a quantidade de n�meros �mpares.
 */
import java.util.Scanner;

public class Ex4_ParEImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int quantidadeNumero, numero;
		
		System.out.print("Qual a quantidade de numeros? ");
		quantidadeNumero = scan.nextInt();
		
		int contador = 0;
		int quantidadePar=0, quantidadeImpar=0;
		do {
			System.out.print("Numero posi��o "+(contador+1)+": ");
			numero = scan.nextInt();
			if((numero % 2) == 0 & (numero != 0)) {
				quantidadePar++;
			}else if((numero % 2) != 0) {
				quantidadeImpar++;
			}else {
				quantidadePar = quantidadePar;
				quantidadeImpar = quantidadeImpar;
			}
			
			contador++;
		}while(contador<quantidadeNumero);
		System.out.println("Quantidade de numeros pares: "+quantidadePar);
		System.out.println("Quantidade de numeros impares: "+quantidadeImpar);
		
		//neste programa aproveito para incrementar a condi��o para o zero j� que zero n�o pode ser considerado par!
	}	
}