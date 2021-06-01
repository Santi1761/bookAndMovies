package model;
import java.time.LocalDate;
import model.State;

public class ProductForRent extends Product implements Rentable {
	
	private LocalDate date;
	private State state;
	
	public ProductForRent(java.lang.String code, java.lang.String name, double price, ProductType type) {
		super(code, name, 5, price, type);
		state = State.AVAILABLE;
		date = LocalDate.of(2021, 06, 01);
	}

	@Override
	public boolean isSafeRent() {
		
		boolean safe = true;
		
		if(getState() == State.AVAILABLE){
			safe = false;
		}
		return safe;
	}

	@Override
	public double getRentPrice(int days) {
		
		double rent = price*days;
		return rent;
	}
	
	public State getState() {
		return state;
	}
	
	public void setState(State state) {
		this.state = state;
	}

	@Override
	public String rentProduct(int days) {
		setState(State.RENTED);
		date = date.plusDays(5);
		return null;
	}

	@Override
	public String Information() {
		
		return null;
	}

	@Override
	public String getInformation() {
		String info = "The code is: "+super.getCode()+ "\nThe name is: "+super.getName()+ "The units are: "+super.getUnits()+ "\nThe price is price: "+super.getPrice(1)+"\nThe type is: "+super.getType()+"\nThe state is: "+state+"\nThe date of today is: "+ date;
		return info;
	}
}
