import java.util.Locale;
import java.util.Scanner;

public class exerc5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int p1,p2,np1,np2;
		double vp1,vp2;
		
		p1 = sc.nextInt();
		np1 = sc.nextInt();
		vp1 = sc.nextDouble();

		p2 = sc.nextInt();
		np2 = sc.nextInt();
		vp2 = sc.nextDouble();
		
		double Total = (np1 * vp1)+(np2 * vp2);
		
		System.out.printf("Valor a pagar = R$ %.2f%n" , Total);
		
		sc.close();

	}

}
