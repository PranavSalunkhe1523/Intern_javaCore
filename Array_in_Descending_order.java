package core_java;

public class Array_in_Descending_order {
	public static void main(String[] args) {
		int[] arr = {5, 2, 9, 1, 6};

        int temp;

        // Sorting in ascending order using Bubble Sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("Array in descending order: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
