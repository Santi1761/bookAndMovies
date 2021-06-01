package model;

public interface Saleable {
	
	public double getSalePrice(int units);
	public boolean isSafePrice(int units);
	public double applyExtraDiscount(double subtotal, double porcentaje1);
	public double calculateTax(double total, double porcentaje2);

}
