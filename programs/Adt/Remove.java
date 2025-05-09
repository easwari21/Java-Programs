import java.util.Scanner;

public class Remove {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};
        int size = 4;

        System.out.println("Before Remove:");
        print(numbers, size);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index ");
        int index = sc.nextInt();

        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                numbers[i] = numbers[i + 1];
            }
            size--;

            System.out.println("After Remove:");
            print(numbers, size);
        } else {
            System.out.println("Invalid index.");
        }
    }

    public static void print(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
