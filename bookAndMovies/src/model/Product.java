package model;

public abstract class Product {
	
	private String code;
	private String  name;
	protected int units;
	protected double price;
	
	private ProductType type;


	public Product(String code, String name, int units, double price, ProductType type) {
		super();
		this.code = code;
		this.name = name;
		this.units = units;
		this.price = price;
		this.type = type;
	}
	
	public abstract String Information();
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	
	public double getPrice(int units) {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ProductType getType() {
		return type;
	}
	public void setType(ProductType type) {
		this.type = type;
	}
	public abstract String getInformation(); 


	


}




