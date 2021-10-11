package for_inventory;

public class Table extends Inventory {
	
	private double width;
	private double length;
	private double height;
	
	public Table(String theName, int theQuantity, double thePrice, String theCode, double theWidth, double theLength, double theHeight) {
		super(theName, theQuantity, thePrice, theCode);
		width = theWidth;
		length = theLength;
		height = theHeight;
	}
	
	@Override
	public String toString() {
		return "We have " + this.getQuantity() + " units of the table " + this.getName() + ", which costs " + this.dollarFormat() + " and it is " + width + " by " + length + " by " + height + "inches.";
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getLength() {
		return length;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double surfaceArea() {
		return width*length;
	}
	

}
