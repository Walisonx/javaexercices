import java.util.Locale;
import java.util.Scanner;

public class exerc5 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	int cod1,qnt1,qnt2,cod2;
	double r1, r2, r3;
	
	cod1 = sc.nextInt();
	qnt1 = sc.nextInt();
    r1 = sc.nextDouble();
    
    cod2 = sc.nextInt();
	qnt2 = sc.nextInt();
    r2 = sc.nextDouble();
    
    r3 = r1 * qnt1 + r2 * qnt2;
    
    System.out.println(" peca " + cod1);
    System.out.println(" qnt "+ qnt1);
    System.out.println(" valor unitario R$ "+r1);
    
    System.out.println(" peca " + cod2);
    System.out.println(" qnt "+ qnt2);
    System.out.println(" valor unitario R$ "+r2);
    
    System.out.println(" valor a pagar: R$ " + r3);
    
    sc.close();
    
	
	
	
	
	
	
	
	
	
	
	}
}
