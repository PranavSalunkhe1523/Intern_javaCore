package core_java;

class A1{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
public class GetSet_method {

	public static void main(String[] args) {
		A1 a = new A1();
		a.setName("Pranav");
		System.out.println(a.getName());
	}

}
