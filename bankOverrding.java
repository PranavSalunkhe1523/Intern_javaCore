package core_java;

public class bankOverrding {
	public void holdername() {
		System.out.println("Salunkhe");
	}
	
	public void acc_no() {
		System.out.println("100");
	}
	
	public void balance() {
		System.out.println("10000");
	}
	public void bankName() {
		System.out.println("RBI");
	}

	public static void main(String[] args) {
		bankOverrding s1 = new bankOverrding();
		s1.holdername();
		s1.acc_no();
		s1.balance();
		s1.bankName();

	}

}
