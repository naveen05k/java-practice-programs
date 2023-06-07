package Arrays_program;

import java.util.Scanner;

public class Max_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//int n = sc.nextInt();
		//int arr[] = new int[10];
		//for (int i = 0; i < arr.length; i++) {
		//	arr[i] = sc.nextInt();
		//}

		int arr[] = { 1,2,3,4,5,7,8,9};
		
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}
