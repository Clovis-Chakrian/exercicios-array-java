public class Ex06 {
	public static void main (String[] args) {
		int arr[] = {1, 2, 4, 5, 3, 12, 15, 6};
		int arrPrim[] = primArr(arr);
		showArr(arr);
		showArr(arrPrim);
	}

	public static int[] primArr(int arr[]) {
		int arrPrim[] = new int[nPrim(arr)];
		int arrPrimPos = 0;

		for (int i = 0; i < arr.length; i++) {
			int nDiv = 0;
			for (int j = 1; j <= arr[i]; j++) {
				if (arr[i] % j == 0) {
					nDiv++;
				}
			}

			if (nDiv == 2) {
				arrPrim[arrPrimPos] = arr[i];
				arrPrimPos++;
			}
		}

		return arrPrim;
	}

	public static int nPrim(int arr[]) {
		int n = 0;
		for (int i = 0; i < arr.length; i++) {
			int nDiv = 0;
			for (int j = 1; j <= arr[i]; j++) {
				System.out.println(j + " -- " + arr[i]);
				if (arr[i] % j == 0) {
					nDiv++;
				}
			}

			if (nDiv == 2) {
				n++;
			}
		}

		return n;
	}

	public static void showArr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("| " + arr[i] + " |");
		}

		System.out.println("\n");
	}
}
