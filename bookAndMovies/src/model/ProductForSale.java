package model;

public class ProductForSale extends Product implements Saleable {
	
	private double descuento;
	
	public ProductForSale(String code, String name, int units, double price, ProductType type) {
		super(code, name, units, price, type);
		descuento = 0;
	}

	@Override
	public double getSalePrice(int x) {
		double precioD = price - descuento;
		double subtotal = units * precioD;
		
		return subtotal;
	}

	@Override
	public boolean isSafePrice() {
		boolean safe = false;
		
		return safe;
	}
	
	public void setDescuento(double descuento)
	{
		this.descuento = descuento;
	}

	@Override
	public double applyExtraDiscount(double porcentaje1, double subtotal) {
		double valorFinal = 0;
		
		valorFinal = porcentaje1 - subtotal;
		return valorFinal;
	}

	@Override
	public double calculateTax(double total, double porcentaje2) {
		double valorFinal = 0;
		valorFinal = total + porcentaje2;
		return valorFinal;
	}

	@Override
	public String getInformation() {
		String info = "The code is: "+super.getCode()+ "\nThe name is: "+super.getName()+ "The units are: "+super.getUnits()+ "\nThe price is price: "+super.getPrice(1)+"\nThe type is: "+super.getType()+"\nThe state is: "+state+"\nThe date of today is: "+ date;
		return info;
		
	}

}
