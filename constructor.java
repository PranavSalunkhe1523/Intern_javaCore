package core_java;

public class constructor {
	constructor(){
		System.out.println("defualt constructor");
	}
	
	constructor(String name){
		System.out.println("Parameterise constructor "+name);
	}
	
	public static void main(String[]args) {
		constructor a = new constructor();
		constructor b = new constructor("Pranav");
		
	}

}
