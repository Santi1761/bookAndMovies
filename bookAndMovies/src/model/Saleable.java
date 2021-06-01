package model;

public interface Saleable {
	
	public double getSalePrice(int x);
	public boolean isSafePrice();
	public double applyExtraDiscount(double x);
	public double calculateTax(double x, double y);

}
