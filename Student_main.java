package core_java;

public class Student_main {

	public static void main(String[] args) {
		Student_task s1 = new Student_task();
		s1.Display_Details("Pranav",11,87);
		if(s1.isPass()) {
			System.out.println("Student is pass  _ _ _ _");
		}else {
			System.out.println("Student is Fail  _ _ _ _");
		}
		Student_task s2 = new Student_task();
		s2.Display_Details("Omkar",12,67);
		if(s2.isPass()) {
			System.out.println("Student is pass  _ _ _ _");
		}else {
			System.out.println("Student is Fail  _ _ _ _");
		}
		
		Student_task s3 = new Student_task();
		s3.Display_Details("rohit",13,35);
		if(s3.isPass()) {
			System.out.println("Student is pass  _ _ _ _");
		}else {
			System.out.println("Student is Fail  _ _ _ _");
		}
		

	}

}
