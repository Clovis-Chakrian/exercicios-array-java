public class Ex02 {
	public static void main (String[] args) {
		int arrA[] = {5, 3, 12, 20, 15};
		int arrB[] = {2, 12, 20, 3, 10};
		int arrC[] = subArr(arrA, arrB);
		
		showArr(arrA);
		showArr(arrB);
		showArr(arrC);
	}

	public static int[] subArr(int arrA[], int arrB[]) {
		int arrC[] = new int[arrA.length];
		for (int i = 0; i < arrC.length; i++) {
			arrC[i] = arrA[i] - arrB[i];
		}

		return arrC;
	}

	public static void showArr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("| " + arr[i] + " |");
		}

		System.out.println("\n");
	} 
}
