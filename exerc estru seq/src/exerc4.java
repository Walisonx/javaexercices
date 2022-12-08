import java.util.Locale;
import java.util.Scanner;

public class exerc4 {
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double  HT, VH, salario;
		int N;
		
		N = sc.nextInt();
		HT = sc.nextDouble();
		VH = sc.nextDouble();
		salario = HT * VH;
		
		System.out.println("number ="+ N);
		System.out.printf("salario = U$ %.2f%n", salario);
		
		sc.close();
		
	
	
	}

}
