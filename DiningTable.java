package for_inventory;

public class DiningTable extends Table {
	
	private int numChairs;
	
	public DiningTable(String theName, int theQuantity, double thePrice, String theCode, double theWidth, double theLength, double theHeight, int theNumChairs) {
		super(theName, theQuantity, thePrice, theCode, theWidth, theLength, theHeight);
		numChairs = theNumChairs;
	}
	
	@Override
	public String toString() {
		return "We have " + this.getQuantity() + " units of the table " + this.getName() + ", which costs " + this.dollarFormat() + " and it is " + this.getWidth() + " by " + this.getLength() + " by " + this.getHeight() + "inches, and has " + numChairs + " chairs.";
	}
	
	public void comfortablySits() {
		int perimeter = (int)((this.getLength() * 2) + (this.getWidth() * 2));
		int answer = perimeter/30;
		System.out.println("This dining room table comfortably sits " + answer + " people.");	
	}
}
