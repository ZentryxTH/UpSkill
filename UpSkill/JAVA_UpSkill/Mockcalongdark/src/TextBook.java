
public class TextBook extends PhysicalBook implements Comparable<TextBook>{
	
	public TextBook(int isbn, String title, int numPages, int publishYear, double msrp) {
		super(isbn,title,numPages,publishYear,msrp);
	}
	
	public int compareTo(TextBook o) {
		return super.getTitle().compareTo(o.getTitle()) != 0 ? super.getTitle().compareTo(o.getTitle()) : Integer.compare(o.getPublishYear(), super.getPublishYear());
	}
}
