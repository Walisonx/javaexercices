import java.util.Locale;
import java.util.Scanner;

public class exe3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			double media = (2*a + 3*b + 5*c) / 10;
			System.out.printf("%.1f%n" , media);
		}

		sc.close();
	}

}
