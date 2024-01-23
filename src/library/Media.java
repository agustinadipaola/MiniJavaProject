package library;

public abstract class Media {

	private static int count;
	private final int id;

	private String name;
	private int year;
	private boolean digital;
	private long issn;

//	default constructor
	public Media() {
		super();
		this.id = ++count;

	}

	public Media(String name, int year, boolean digital, long issn) {
		super();
		this.id = ++count;
		this.name = name;
		this.year = year;
		this.digital = digital;
		this.issn = issn;

	}

	public void print() {
		System.out.println("Name: " + this.name);
		System.out.println("Year: " + this.year);
		System.out.println("Digital Edition?: " + this.digital);
		System.out.println("ISSN: " + this.issn);

	}

	@Override
	public String toString() {
		return "ID Number: " + id + " Name: " + name + " Publised year: " + year + " Is a Digital Edition? " + digital
				+ " ISSN number: " + issn;
	}

	public int compateTo(Media z) {
		return id - z.id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;

	}

	public boolean getDigital() {
		return digital;
	}

	public void setdigital(boolean digital) {
		this.digital = digital;

	}

	public long getIssn() {
		return issn;
	}

	public void setIssn(long issn) {
		this.issn = issn;

	}

	public int getId() {
		return id;
	}

}
