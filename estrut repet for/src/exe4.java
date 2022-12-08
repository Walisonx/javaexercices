import java.util.Scanner;

public class exe4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			double r = x / y;
			if (y == 0) {
				System.out.println("impo");

			}else {
			System.out.printf("%.1f%n", r);
			}
		}
		sc.close();
	}
}
