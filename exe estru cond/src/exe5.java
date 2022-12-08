import java.util.Locale;
import java.util.Scanner;

public class exe5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cod, q;
		cod = sc.nextInt();
		q = sc.nextInt();

		double t = 0;

		if (cod == 1) {
			t = q * 4.00;
			}

		else if (cod == 2) {
			t = q * 4.50;
			}

		else if (cod == 3) {
			t = q * 5.00;
			}

		else if (cod == 4) {
			t = q * 2.00;
			}

		else if (cod == 5) {
			t = q * 1.50;
			}

		else {
			System.out.println("digite um codigo valido");
		}

		System.out.printf("Total : R$ %.2f%n" , t );
		
		sc.close();
	}
}
