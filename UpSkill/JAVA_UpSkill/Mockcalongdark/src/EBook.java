
public class EBook extends Book {

	public EBook(int isbn, String title, int numPages, int publishYear, double msrp) {
		super(isbn,title,numPages,publishYear,msrp);
	}
	
	public double getCurrentPrice(int currentYear) {
		return super.getMsrp() * Math.pow(0.95,(currentYear-super.getPublishYear()));
	}
	
	public double getFileSize() {
		return (super.getTitle().length() + super.getNumPages() * 1800) / 100000 ;
	}
}
