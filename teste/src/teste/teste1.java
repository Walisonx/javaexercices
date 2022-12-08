package teste;

import java.util.Locale;
import java.util.Scanner;

public class teste1 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println(" enter valours ");
		double VG = sc.nextDouble();
		double CNL = sc.nextDouble();
		int Cadastro = sc.nextInt();
		int Compra = sc.nextInt();
		double CPC = sc.nextDouble();

		if (VG > 0.50 && CNL < 1) {
			System.out.println("desativar");
		} else {
			System.out.println("check1");
		}
		if (VG > 1 && Cadastro < 1) {
			System.out.println("desativar");
		} else {
			System.out.println("check2");
		}
		if (VG > 2 && Cadastro > 1 && Compra < 1) {
			System.out.println("desativar");
		} else {
			System.out.println("check3");
		}
		if (Compra > 1 && CPC <= 10) {
			System.out.println("check 4");
		} else {
			System.out.println("desativar");
		}

	}
}