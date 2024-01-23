package library;

public class App {

	public static void main(String[] args) {

		Book book1 = new Book("Mr Mercedes", 2014, false, 97814447L, "Hodder");
		Newspaper news1 = new Newspaper("The New York Times", 2023, true, 03614331L, "Escellent");
		Magazine mag1 = new Magazine("Discover", 2021, false, 10959203L, "Science");

		Library library = new Library();

		library.addItem(book1);
		library.addItem(mag1);
		library.addItem(news1);
		library.addItem(new Book("Conspiracy: The greatest plots", 2020, false, 978183859L, "Arcturus"));
		library.addItem(new Magazine("Discover", 1998, false, 12233458L, "Computers"));
//		library.removeItem(book1);

		System.out.println(library);
		Person p = new Person("Agustina", 33);

		Person p2 = new Person("Tadas", 30);

		System.out.println(Person.getLibMembers());
	}
}
