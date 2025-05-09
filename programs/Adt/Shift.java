public class Shift {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};
        int size = 4;
        System.out.println("Before Shift:");
        print(numbers, size);
        for (int i = 0; i < size - 1; i++) {
            numbers[i] = numbers[i + 1];
        }
        size--;
        System.out.println("After Shift:");
        print(numbers, size);
    }

    public static void print(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
