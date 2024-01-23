package library;

public class Person {
	private static int count;
	private final int id;
	private static String libMembers = "Library Members";

	private String name;

	private int age;

	public Person() {
		super();
		this.id = ++count;
	}

	public Person(String name, int age) {
		super();
		this.id = ++count;
		this.name = name;
		this.age = age;
	}

	public void print() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
	}

	@Override
	public String toString() {
		return "ID Number: " + id + " Name: " + name + " Age: " + age;
	}

	public String getName() {
		return name;
	}

	public int compateTo(Person t) {
		return id - t.id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static String getLibMembers() {
		return libMembers;

	}

	public int getId() {
		return id;
	}

}