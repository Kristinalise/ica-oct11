package for_inventory;

import java.text.*;
public class Inventory {
	
	private String name;
	private int quantity;
	private double price;
	private String code;
	
	public Inventory(String theName, int theQuantity, double thePrice, String theCode) throws IllegalArgumentException{
		if(theQuantity < 0 || thePrice < 0) {
			throw new IllegalArgumentException("Price and/or quantity cannot be negative values.");
		}
		name = theName;
		quantity = theQuantity;
		price = thePrice;
		code = theCode;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getCode() {
		return code;
	}
	
	public String getName() {
		return name;
	}
	
	public String dollarFormat() {
		return NumberFormat.getCurrencyInstance().format(price);
	}
	
	@Override
	public String toString() {
		return "The code of this item is " + code + ".";
	}

}
