package entities;

public class dolar {

	public static double dolar;
	public static double dolarAmount;
	public static final double IOF = 0.06;
	
	public static double currentConverter() {
		return dolar * dolarAmount + (dolar *dolarAmount * IOF);
	}
	
	
}
