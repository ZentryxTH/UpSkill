//**** DO NOT MODIFY THIS FILE ****//
public abstract class Book {
	private int isbn = -1;
	private String title = null;
	private int numPages = -1;
	private int publishYear = -1;
	private double msrp = -1;
	
	
	public Book(int isbn, String title, int numPages, int publishYear, double msrp) {
		this.isbn = isbn;
		this.title = title;
		this.numPages = numPages;
		this.publishYear = publishYear;
		this.msrp = msrp;
	}


	public int getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}

	public int getNumPages() {
		return numPages;
	}

	public int getPublishYear() {
		return publishYear;
	}

	public double getMsrp() {
		return msrp;
	}

	@Override
	public String toString() {
		return "[ISBN=" + isbn + ", Title=" + title + ", # Pages=" + numPages + ", Year=" + publishYear + ", MSRP="
				+ msrp + "]";
	}

	public abstract double getCurrentPrice(int currentYear);
	
}
