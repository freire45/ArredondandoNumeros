package br.com.erickfreire.arredondandoNumeros;

import java.util.Scanner;

/**
 * Programa em Java que arredonda valores
 * @author Erick Freire
 * @version 1 - Criado em 28-04-2021 as 19:35
 */

public class ArredondandoNumeros {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que arredonda um valor: ");
		
		System.out.print("Informe um valor de ponto flutuante: ");
		double numeroOriginal = entrada.nextDouble();
		
		double novoNumero = Math.floor(numeroOriginal + 0.5);
		
		System.out.printf("%nO numero Original %f foi convertido para %f%n", numeroOriginal, novoNumero);

	}

}
