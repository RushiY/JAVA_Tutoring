package class_hierarchies;

public class Student {
	@Override
	public String toString() {
		return "Student [address=" + address + ", department=" + department + ", marks=" + marks + ", name=" + name
				+ ", collegeID=" + collegeID + "]";
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Marks getMarks() {
		return marks;
	}

	public void setMarks(Marks marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCollegeID() {
		return collegeID;
	}

	public void setCollegeID(int collegeID) {
		this.collegeID = collegeID;
	}

	private Address address;
	private Department department;
	private Marks marks;
	private String name;
	private int collegeID;

	public Student(Address a, Department d, Marks m, String n, int c) {
		address = a;
		department = d;
		marks = m;
		name = n;
		collegeID = c;
	}
}
