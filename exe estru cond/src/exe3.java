import java.util.Scanner;

public class exe3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b;
		
        a = sc.nextInt();
        b = sc.nextInt();
        
		if (a%2==0 && b%2==0)
			System.out.println("sao multiplos");
		else {
			System.out.println("nao multiplos");
		}
		
		sc.close();
	}

}
