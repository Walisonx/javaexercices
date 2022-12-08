package program;

import java.util.Locale;
import java.util.Scanner;

import entities.aluno;

public class exe3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		aluno aluno = new aluno();
		
		System.out.println("Name:");
		aluno.name = sc.nextLine();
		System.out.println("notas:");
		aluno.nota1 =sc.nextDouble();
		aluno.nota2 =sc.nextDouble();
		aluno.nota3 =sc.nextDouble();
		
		if(aluno.soma() > 60) {
			System.out.println("final grade = " + aluno.soma());
			System.out.println("pass");
		}else {
			System.out.println("final grade = " + aluno.soma());
			System.out.println("failed");
			System.out.printf("%.2f",aluno.missing());

			
		}
		sc.close();
	}

}
