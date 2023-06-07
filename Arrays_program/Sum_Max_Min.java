package Arrays_program;
public class Sum_Max_Min {
	static int Sum_max(int arr[], int n) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		int sum = max + min;
		return sum;
	}

	
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int n = arr.length;
		System.out.println("Input:");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]);
		}
		System.out.println(" ");
		System.out.println("Output:");
		int result = Sum_max(arr, n);
		System.out.println(result);
	}

}
