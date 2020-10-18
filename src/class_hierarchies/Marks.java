package class_hierarchies;

public class Marks {
	private int total;
	private char letterGrade;

	public Marks(int t, char l) {
		total = t;
		letterGrade = l;
	}

	@Override
	public String toString() {
		return "Marks [total=" + total + ", letterGrade=" + letterGrade + "]";
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public char getLetterGrade() {
		return letterGrade;
	}

	public void setLetterGrade(char letterGrade) {
		this.letterGrade = letterGrade;
	}
}
