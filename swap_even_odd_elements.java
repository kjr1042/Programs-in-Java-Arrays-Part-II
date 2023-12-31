import java.util.Scanner;

public class swap_even_odd_elements {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Input size of array
        int N = scanner.nextInt();

        // Input array elements
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        // Call the function to swap even and odd index elements
        swapEvenOddElements(arr);
	}
	public static void swapEvenOddElements(int[] arr) {
        // Print the array before swapping
        System.out.println("Before Swapping:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Swap even and odd index elements
        for (int i = 0; i < arr.length - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

        // Print the array after swapping
        System.out.println("After Swapping:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
