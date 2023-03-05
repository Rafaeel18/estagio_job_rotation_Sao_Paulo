package estagio;

import java.util.Scanner;

public class Exerciso2 {
	
public static void main(String[] args) {
		
		int numero;
		
		System.out.println("informe un numero inteiro por favor");
		numero = new Scanner(System.in).nextInt();
		
		
		int n1 = 0, n2 = 1, n3;
		System.out.println("serie de Fibonacci: ");
		System.out.print("-" + n1 + "");
		System.out.print("-" + n2 + "");
		do {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			;
			System.out.print("-" + n3);

		}

		while (n3 < numero);
		
		if(numero == n1||numero == n2|| numero == n3) {
			System.out.println("\no numero informado pertenece a secuencia");
		}else {
			System.out.println("\no numero informado nao pertenece a secuencia");
		}

	}



	}





