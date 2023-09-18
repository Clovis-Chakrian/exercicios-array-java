public class Ex05 {
	public static void main(String[] args) {
		int arr[] = {1, 5, 12, 2, 21, 13};
		int arrB[] = reverseArr(arr);
		showArr(arr);
		showArr(arrB);
	}

	public static int[] reverseArr(int arr[]) {
		int reversedArr[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			reversedArr[i] = arr[arr.length - i - 1];
		}

		return reversedArr;
	}

	public static void showArr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("| " + arr[i] + " |");
		}

		System.out.println("\n");
	}
};
