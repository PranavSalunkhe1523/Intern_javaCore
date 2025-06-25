package core_java;

public class Student_task {
	public String Name;
	public int Roll_No;
	public int Mark;

	public void Display_Details(String Name, int Roll_No, int Mark) {
		this.Name = Name;
		this.Roll_No = Roll_No;
		this.Mark = Mark;

		System.out.println("Student Name: " + this.Name);
		System.out.println("Student Roll_No: " + this.Roll_No);
		System.out.println("Student  Mark: " + this.Mark);

	}

	public boolean isPass() {
		if (this.Mark >= 40) {
			return true;
		}
		return false;
	}
}
