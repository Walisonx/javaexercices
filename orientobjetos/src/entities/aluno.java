package entities;

public class aluno {

	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double soma() {
		return nota1+nota2+nota3;
	}
	public double missing() {
		return 160-(this.soma() +100);
	}
	
}
