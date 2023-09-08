public class Ex01 {
	public static void main (String[] args) {
		int array[] = {1, 5, 8, 12, 15, 20, 33, 10};
		int arrB[] = multArr(array, 3);
		showArr(array);
		showArr(arrB);
		showArr(array);
		System.out.println("Hello World");
	}

	public static int[] multArr(int arrA[], int value) {
		int arrB[] = new int[arrA.length];
		for (int i = 0; i < arrA.length; i++) {
			arrB[i] = arrA[i] * value;
		}

		return arrB;
	}

	public static void showArr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("| " + arr[i] + " |");
		}

		System.out.println("");
	};
}
