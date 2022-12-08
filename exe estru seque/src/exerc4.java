import java.util.Locale;
import java.util.Scanner;

public class exerc4 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int NF;
		double HT, SPH;
		
		NF = sc.nextInt();
		HT = sc.nextDouble();
		SPH = sc.nextDouble();
		
		double Salary = HT * SPH;
		
		System.out.println("Number = " + NF);
		System.out.printf("Salary = U$ %.2f%n" , Salary);
		
		
		
		
		
		
		
		sc.close();

	}

}
