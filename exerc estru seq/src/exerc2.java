import java.util.Locale;
import java.util.Scanner;

public class exerc2 {
	
	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	double r, pi, area, r2;

	pi = 3.14159;
	r = sc.nextDouble();
	r2 = Math.pow( r , 2.0);
	area = pi * r2;
	
	System.out.printf("A area do circulo e: %.4f%n", area);
	
	
	
	sc.close();
	}

}
