package library;

public class Newspaper extends Media {
	private String condition;

	public Newspaper() {

	}

	public Newspaper(String name, int year, boolean digital, long ISSN, String condition) {
		super(name, year, digital, ISSN);
		this.condition = condition;

	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Condtion of the newspaper?: " + this.condition);
	}
}
