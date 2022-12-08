import java.util.Locale;
import java.util.Scanner;

public class exerc6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double A, B, C;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		double tri = A * C / 2;
		double cir = 3.14159 * Math.pow(C, 2);
		double tra = 0.5 * C *(A+B);
		double qua = B * B;
		double ret = A * B;
		
		System.out.printf("Triangulo: %.3f%n" , tri);
		System.out.printf("Circulo: %.3f%n" , cir);
		System.out.printf("Trapézio: %.3f%n" , tra);
		System.out.printf("Quadrado: %.3f%n" , qua);
		System.out.printf("Retangulo: %.3f%n" , ret);
		
		
		
		
		
		
		
		sc.close();

	}

}
