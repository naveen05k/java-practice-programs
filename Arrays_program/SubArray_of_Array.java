package Arrays_program;

public class SubArray_of_Array {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4 };
		int n = arr.length;
		System.out.println("Input:");
		for (int i = 0; i < n; i++) {
			System.out.printf(arr[i] + " ");
		}
		System.out.println(" ");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				for(int k=i;k<=j;k++) {
					System.out.print(arr[k]);
				}
				System.out.println();
			}
		}
	}
}
