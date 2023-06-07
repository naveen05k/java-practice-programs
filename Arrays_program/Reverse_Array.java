package Arrays_program;

import java.util.Scanner;

public class Reverse_Array {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		int n = arr.length;
		System.out.println("Input:");
		for(int i=0;i<n;i++) {
			System.out.printf(arr[i]+" ");
		}
		int i=0;
		int j =n-1;
		while(i<j) {
			int temp = arr[i];
			arr[j] =arr[i];
			arr[i] = temp;
			i++;
			j--;
		}
		System.out.println("");
		System.out.println("Output:");
		for(int k=0;k<n;k++) {
			System.out.printf(arr[k] + " ");
		}

	}
}
