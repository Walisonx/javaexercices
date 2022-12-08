import java.util.Scanner;

public class exe4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i, f;
		int dia = 24;

		i = sc.nextInt();
		f = sc.nextInt();

		int d = dia - i + f;

		if (d <= 24)
			System.out.println("o jogo durou " + d + " horas");
		else {
			System.out.println("o jogo durou " + (d-24) + " horas");
		}

		sc.close();
	}

}
