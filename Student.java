package core_java;

public class Student {
	Student(int id){
		System.out.println("Student ID :"+id);
	}
	
	Student(String name){
		System.out.println("Student Name :"+name);
	}
	
	Student(int pin,String address){
		System.out.println("Pin code: "+pin+" Student Address :"+address);
	}
	
	Student(double PRN_No,String Stream){
		System.out.println("Student PRN-NO :"+PRN_No+" Student Stream :"+Stream);
	}
	
	Student(long Mob_num){
		System.out.println("Student Mob-Num :"+Mob_num);
	}
	
	Student(float marks){
		System.out.println("Student Marks :"+marks);
	}
	
	Student(double Fees){
		System.out.println("Student Fees :"+Fees);
	}
	public static void main(String[]args) {
		Student s1 = new Student(11);
		Student s2 = new Student("Pranav");
		Student s3 = new Student(591219,"Nipani");
		Student s4 = new Student(2278d,"CSE");
		Student s5 = new Student(9448992432L);
		Student s6 = new Student(88.96f);
		Student s7 = new Student(115000.00);
		
		
	}

}
