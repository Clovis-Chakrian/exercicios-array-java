public class Ex03 {
	public static void main (String[] args) {
		int arrA[] = {1, 5, 12, 30, 20};
		int arrB[] = {4, 12, 40, 30, 90, 205, 100, 3, 2};
		int arrC[] = joinArr(arrA, arrB);

		showArr(arrA);
		showArr(arrB);
		showArr(arrC);
	}

	public static int[] joinArr(int arrA[], int arrB[]) {
		int arrC[] = new int[arrA.length + arrB.length];
		for (int i = 0; i < arrC.length; i++) {
			if (i > arrA.length - 1) {
				arrC[i] = arrB[i - arrA.length];
			} else {
				arrC[i] = arrA[i];
			}
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
