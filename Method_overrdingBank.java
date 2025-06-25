package core_java;

class example{
	String holderName;
	long accountNumber;
	double Balance;
	String bankName;
	
	void info(String name) {
		this.holderName =name;
	}
	
	void info(long num,String bankname) {
		this.accountNumber =num;
		this.bankName = bankname;
	}
	
	void info(double amount) {
		this.Balance =amount;
	}
	
	void display() {
		System.out.println("Bank Name : "+bankName);
		System.out.println("Account Number : "+accountNumber);
		System.out.println("Holder Name : "+holderName);
		System.out.println("Amount : "+Balance);
	}
}

public class Method_overrdingBank {
	public static void main(String[]args) {
		example s1 = new example();
		s1.info("Pranav Salunkhe");
		s1.info(1023,"SBI");
		s1.info(100000);
		s1.display();
	}

}
