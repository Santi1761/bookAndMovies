package model;

public interface Rentable {
	
	public boolean isSafeRent();
	public double getRentPrice(int days);
	public String rentProduct(int days);

}
