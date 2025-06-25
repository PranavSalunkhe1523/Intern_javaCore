package core_java;

public class String_Method {
	public static void main(String[]args) {
		String str = "Hello";
		String str2 = "Java";
		String s ="		hey   ";
		
		System.out.println("str-length: "+str.length());
		System.out.println("Uppercase: "+str.toUpperCase());
		System.out.println("Lowercase: "+str.toLowerCase());
		System.out.println("concat: "+str.concat(str2));
		System.out.println("charAt: "+str.charAt(2));
		System.out.println("Replace: "+str.replace("h", "y"));
		System.out.println("indexOf: "+str.indexOf("o"));
		System.out.println("String equal: "+str.equals(2));
		System.out.println("Trim String:"+s.trim());
		
		String s1 = "pink;blue;"
				+ "white";
		String[]color = s1.split(";");
		for(String f : color) {
			System.out.println(f);
		}
	}

}
