package somaDeProdutos;

/*
 * 02 Crie um programa que leia o preço de dois produtos 
 * e escreva o valor total da compra. Lembre-se que valores 
 * são números fracionados, ou seja, 
 * declare-os com o tipo double.
 * 
 */


import java.util.Scanner;

public class Produtos {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Qual é o valor do produto 01?");
		double produto01 = scan.nextDouble();

		System.out.println("Qual é o valor do produto 02?");
		double produto02 = scan.nextDouble();
		
		double valorTotal = produto01 + produto02;
		
		System.out.printf("\nO valor total é R$ %.2f.", valorTotal);	}

}

