package Arrays_program;

public class Linear_Searchp {
	 static int linearSearch(int[] A,int B) {
		for(int i=0;i<A.length;i++) {
			if(A[i]==B) {
				return 1;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 7, 8, 9 };
		int target = 10;
		int resut = linearSearch(arr,target);
		System.out.println(resut);
		
		
	}
}
