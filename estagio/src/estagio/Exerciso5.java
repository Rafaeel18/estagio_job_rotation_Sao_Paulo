package estagio;

import java.util.Scanner;

public class Exerciso5 {
	
	public static void main(String[] args) {
        

        System.out.print("Ingrese uma Frase: ");
        String cadena = new Scanner(System.in).nextLine();

        String caracteresInvertidos = "";

        for (int i = cadena.length() - 1; i >= 0; i--) {
        	caracteresInvertidos += cadena.charAt(i);
        }

        System.out.println("caracteres invertidos : " + caracteresInvertidos);
    }
}