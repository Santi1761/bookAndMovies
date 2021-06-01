package model;

public class ProductForSale extends Product implements Saleable {

	public ProductForSale(String code, String name, int units, double price, ProductType type) {
		super(code, name, units, price, type);
		
	}

	@Override
	public double getSalePrice(int x) {
		
		return 0;
	}

	@Override
	public boolean isSafePrice() {
		
		return false;
	}

	@Override
	public double applyExtraDiscount(double x) {
		
		return 0;
	}

	@Override
	public double calculateTax(double x, double y) {
		
		return 0;
	}

	@Override
	public String getInformation() {
		
		return null;
	}

}
