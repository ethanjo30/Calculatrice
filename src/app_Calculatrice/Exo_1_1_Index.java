package app_Calculatrice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exo_1_1_Index {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez le premier nombre : ");
        int a = scanner.nextInt();

        System.out.println("Entrez le deuxième nombre : ");
        int b = scanner.nextInt();;

        System.out.println("Choisissez l'opération : ");
        System.out.println("1. Addition");
        System.out.println("2. Soustraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        char op = (char) scanner.nextInt();

        System.out.println(Exo_1_1_Calculer.Calculer(a, b, op)); 
	    }
	
	}

	


