import java.util.Locale;
import java.util.Scanner;

public class exerc6 {

	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a,b,c,tri,cir,tra,qua,ret, pi;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		pi = 3.14159;
		
		tri = a * c / 2;
		cir = pi * (c * c );
		tra = (a + b)*c / 2;
		qua = b *b;
		ret = a * b;
		
		System.out.printf("triangulo: %.3f%n", tri);
		System.out.printf("circulo: %.3f%n", cir);
		System.out.printf("trapezio: %.3f%n", tra);
		System.out.printf("quadrado: %.3f%n", qua);
		System.out.printf("retangulo: %.3f%n", ret);
		
		sc.close();
 }
}