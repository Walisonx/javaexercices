package program;

import java.util.Locale;
import java.util.Scanner;

import entities.dolar;

public class exefix {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("what is the dollar price? ");
		dolar.dolar =sc.nextDouble();
		System.out.println("how many dollars will be bought?");
		dolar.dolarAmount = sc.nextDouble();
		System.out.printf("amount to be paid in  reais = %.2f" , dolar.currentConverter());
		
		
		sc.close();
	}

}
