public class BubbleSort {
	public static void main(String[] args) {
		int arr[] = {10, 15, 2, 5, 13, 1};
		showArr(arr);
		bubbleSort(arr);
		showArr(arr);
	}

	public static void bubbleSort(int arr[]) {
		int scans = arr.length;
		while (scans >= 2) {
			for (int i = 0; i < scans - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
			scans--;
		}
	}

	public static void showArr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("| " + arr[i] + " |");
		}

		System.out.println("\n");
	}
}
