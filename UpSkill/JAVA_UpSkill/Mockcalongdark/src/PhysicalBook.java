
public class PhysicalBook extends Book{
	
	public PhysicalBook(int isbn, String title, int numPages, int publishYear, double msrp) {
		super(isbn, title, numPages, publishYear, msrp);
	}
	
	public double getCurrentPrice(int currentYear) {
		return super.getMsrp() * ((0.4 * Math.pow(1.0005, super.getNumPages())+(0.6 * Math.pow(1.05, (currentYear-super.getPublishYear())))));
	}
	
	public double getWeight() {
		return (super.getNumPages() * 5) / 1000;
	}
}
