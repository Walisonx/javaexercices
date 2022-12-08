import java.util.Scanner;

public class exe1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x;
		x= sc.nextInt();
		
		if (x<0)
			System.out.println("negativo");
		else {
			System.out.println("positivo");
		}
		
		
		
		
		sc.close();
	}

}
