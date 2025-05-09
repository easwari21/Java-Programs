public class Rotate {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};
        int size = 4;
        System.out.println("Before Rotate:");
        print(numbers, size);
        int last = numbers[size - 1];
        for (int i = size - 1; i > 0; i--) {
            numbers[i] = numbers[i - 1];
        }
        numbers[0] = last;
        System.out.println("After Rotate:");
        print(numbers, size);
    }

    public static void print(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
