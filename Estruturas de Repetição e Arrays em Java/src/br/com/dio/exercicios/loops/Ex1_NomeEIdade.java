package br.com.dio.exercicios.loops;

/* 
Fa�a um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare inserindo o valor 0 no campo nome)
*/

import java.util.Scanner;

public class Ex1_NomeEIdade {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String nome;
		int idade;
		
		while(true) {
			System.out.print("Nome: ");
			nome = scan.next();
			
			if(nome.equals("0")) break;
			
			System.out.print("Idade: ");
			idade = scan.nextInt();
			
			System.out.println("Deseja parar? Aperte ZERO ou escreva outro NOME para continuar!");
		}
	}
}
