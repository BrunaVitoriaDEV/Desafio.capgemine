package br.com.questao01;

import java.io.IOException;
import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) throws IOException {
		System.out.println("Quantos degraus deseja ter em sua escada?");
		int n = lerNumeroDegraus();
		for(int x = 0; x < n; x++) {
			completarComEspacos(n, x + 1);
		}
	}

	//Função que lê um número inteiro. Caso o usuário não digite um número, a função é chamada recursivamente
	public static Integer lerNumeroDegraus() {
		Scanner sc = new Scanner(System.in);
		try {
			return Integer.parseInt(sc.next());
		}
		catch (Exception e) {
			System.out.println("Digite um número inteiro!\n");
			return lerNumeroDegraus();
		}
	}

	//Função que desenha cada degrau da escada
	public static void completarComEspacos(int n, int m) {
		for(int x = 0; x < n - m; x++) {
			System.out.print(" ");
		}
		for(int x = 0; x < m; x++) {
			System.out.print("*");
		}
		System.out.print("\n");
	}
}
