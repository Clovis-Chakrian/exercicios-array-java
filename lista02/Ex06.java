public class Ex06 {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 12, 15};
		int arrB[] = {3, 5, 15, 20};
		int arrC[] = juntaArray(arr, arrB);
		bubbleSort(arrC);
		mostraArr(arrC);
	}

	public static int[] juntaArray(int arrA[], int arrB[]) {
		int arrC[] = new int[arrA.length + arrB.length];

		for (int i = 0; i < arrA.length; i++) {
			arrC[i] = arrA[i];
		};

		for (int i = 0; i < arrB.length; i++) {
			arrC[arrA.length + i] = arrB[i];
		};

		return arrC;
	}

	public static void bubbleSort(int arr[]) {
		int i = arr.length;

		while (i >= 2) {
			for (int j = 0; j < i - 1; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}

			i--;
		}
	}

	public static void mostraArr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("| " + arr[i] + " |");
		}

		System.out.println("\n");
	};
}
