package Arrays_program;

public class Rotate_90_Degree {

	static void rotatearray(int arr[][], int n) {
		/// step 1 : Traverse the array
		n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}

		//// step 2 : Reverse the each row
		for (int i = 0; i < n; i++) {
			int low = 0;
			int high = n - 1;

			while (low < high) {
				int temp = arr[i][low];
				arr[i][low] = arr[high][i];
				arr[high][i] = temp;
			}
		}

		/// step 3 : print the array

		System.out.println("Rotated array");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println(arr[i][j] + " " + "\t");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int n = arr.length;
		System.out.println("Input:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		rotatearray(arr, n);

	}
}
