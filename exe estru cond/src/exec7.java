import java.util.Locale;
import java.util.Scanner;

public class exec7 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x,y;
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		if ( x >0 && y >0 ) {
			System.out.println("q1");
		}
		else if (x <0 && y >0) {
			System.out.println("q2");
		}
		else if (x >0 && y <0) {
			System.out.println("q4");
		}
		else if (x <0 && y <0) {
			System.out.println("q3");
		}
		else if( x== 0 && y == 0){
			System.out.println("Origem");
		}
		else if( x== 0){
			System.out.println("eixo y");
		}
		else if( y== 0){
			System.out.println("eixo x");
		}
				
		
		
		
		
		sc.close();
	}

}
