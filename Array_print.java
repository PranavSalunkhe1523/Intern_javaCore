package core_java;

public class Array_print {
	public static void main(String[]args) {
		int arr[] = {40, 90,50,60,32};
		
		for(int i = 0 ; i < arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println();
		for(int i = 0 ; i < arr.length;i+=2) {
			System.out.println(arr[i]);
		}
		
		System.out.println();
		System.out.print("max ");
		int max =arr[0];
		for(int i = 1; i < arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.print(max);
		
		System.out.println();
		System.out.print("min ");
		int min =arr[0];
		for(int i = 1; i < arr.length;i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.print(min);
		
		System.out.println();
		System.out.print("2nd max ");
		int tem;
		int _2ndmax =arr[0];
		for(int i = 1; i < arr.length;i++) {
			for(int j = i+1; j < arr.length;j++) {
				if(arr[i] <arr[j]) {
					tem = arr[i];
					arr[i] = arr[j];
					arr[j]= tem;
				}
			}
		}
		System.out.print(arr[2]);
		
		System.out.println();
		System.out.print("2nd min ");
		int temp;
		int _2ndmin =arr[0];
		for(int i = 1; i < arr.length;i++) {
			for(int j = i+1; j < arr.length;j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j]= temp;
				}
			}
		}
		System.out.print(arr[2]);
		
	}

}
