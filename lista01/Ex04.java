public class Ex04 {
	public static void main(String[] args) {
		int arr[] = {2, 3, 5, 4, 8};
		int arrB[] = squareArr(arr);
		showArr(arr);
		showArr(arrB);
	}

	public static int[] squareArr(int arr[]) {
		int arrB[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arrB[i] = arr[i] * arr[i];
		}

		return arrB;
	};

	public static void showArr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("| " + arr[i] + " |");
		}

		System.out.println("\n");
	};
};
