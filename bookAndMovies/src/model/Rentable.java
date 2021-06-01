package model;

public interface Rentable {
	
	public boolean isSafeRent();
	public double getRentPrice(int x);
	public String rentProduct(int x);

}
