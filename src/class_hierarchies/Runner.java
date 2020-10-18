package class_hierarchies;

public class Runner {

	public static void main(String[] args) {
		Address a = new Address("4728 Vallaress", "Way", "Carrolton", "TX", 75010);
		Department d = new Department(12064125, "Rushi");
		Marks m = new Marks(95, 'A');
		Student s = new Student(a, d, m, "Rushi", 12064125);

		System.out.println(s.getAddress().getCity());
		s.getAddress().setCity("Dallas");
		System.out.println(s.getAddress().getCity());
		System.out.println(s);
	}

}
