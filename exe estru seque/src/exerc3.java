import java.util.Scanner;

public class exerc3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A , B , C , D;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		int Dif = ( A * B - C * D );
		
		System.out.print("Dif = " + Dif);
		
		
		
		
		
		sc.close();
	}

}
