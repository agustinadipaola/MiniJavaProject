package library;

public class Magazine extends Media {
	private String subject;

	public Magazine(String name, int year, boolean digital, long ISSN, String subject) {
		super(name, year, digital, ISSN);
		this.subject = subject;

	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Subject: " + this.subject);
	}
}
