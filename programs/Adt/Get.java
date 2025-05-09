import java.util.Scanner;

public class Get {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};
        int size = 4;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index: ");
        int index = sc.nextInt();

        if (index >= 0 && index < size) {
            System.out.println("Element at index " + index + " is " + numbers[index]);
        } else {
            System.out.println("Invalid index.");
        }
    }
}
