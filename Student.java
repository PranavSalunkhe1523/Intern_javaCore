package core_java;

import java.util.ArrayList;

class Stud{
	private int id;
	private String name; 
	private float mark;
	private String stream;
	private String location;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMark() {
		return mark;
	}
	public void setMark(float mark) {
		this.mark = mark;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Stud [id=" + id + ", name=" + name + ", mark=" + mark + ", stream=" + stream + ", location=" + location
				+ "]";
	}
	
}

class Data{
	ArrayList<Stud> data() {
		Stud s1 = new Stud();
		s1.setId(1);
		s1.setMark(74f);
		s1.setName("Pranav");	
		s1.setStream("CSE");
		s1.setLocation("Pune");
		
		Stud s2 = new Stud();
		s2.setId(2);
		s2.setMark(60f);
		s2.setName("Ram");	
		s2.setStream("ENTC");
		s2.setLocation("Pune");
		
		Stud s3 = new Stud();
		s3.setId(3);
		s3.setMark(77f);
		s3.setName("Om");	
		s3.setStream("CSE");
		s3.setLocation("Pune");
		
		Stud s4 = new Stud();
		s4.setId(4);
		s4.setMark(94f);
		s4.setName("Vivek");	
		s4.setStream("CSE");
		s4.setLocation("Pune");
		
		ArrayList <Stud> a = new ArrayList();
		a.add(s1);
		a.add(s2);
		a.add(s3);
		a.add(s4);
		
		return a;
		
		}
	
}
public class Student {
	void data2() {
		Data  d = new Data();
		ArrayList<Stud> s=	d.data();
		
//		ArrayList<Data> a1 = new ArrayList();
		
		
		for (Stud data : s) {
			if("Pune".equals(data.getLocation()) && "CSE".equals(data.getStream()) && data.getMark()>=60) {
				System.out.println(data);
			}
			
//			if(data.getMark()>=70) {
//				System.out.println(data);
//			}
//			
		}
	}

	public static void main(String[] args) {
		
		Student t1=new Student();
		t1.data2();

	}

}
