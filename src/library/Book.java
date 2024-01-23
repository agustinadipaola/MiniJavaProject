package library;

public class Book extends Media {
	private String publisher;

	public Book(String name, int year, boolean digital, long issn, String publisher) {
		super(name, year, digital, issn);
		this.publisher = publisher;

	}

	@Override
	public void print() {
		super.print();
		System.out.println("Publisher name?: " + this.publisher);
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

}
