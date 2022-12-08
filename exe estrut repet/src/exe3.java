import java.util.Scanner;

public class exe3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cod = sc.nextInt();
		int al = 0, ga = 0, di = 0;

		while (cod != 4) {
			if (cod == 1) {
				al += 1;
				
			} else if (cod == 2) {
				ga += 1;
				
			} else if (cod == 3) {
				di += 1;
				
			} 
				cod = sc.nextInt();
		}
			
			System.out.println("muito obg");
			System.out.println("alcool = " + al);
			System.out.println("gasolina = " + ga);
			System.out.println("diesel = " + di);

			sc.close();
		}

		
	}


