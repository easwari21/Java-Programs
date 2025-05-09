public class InsertionSort {
    public static void main(String[] args) {
        int[] numbers = {40, 20, 10, 30, 50}; 
        int size = numbers.length;
        System.out.println("Before Sorting:");
        print(numbers, size);
        for (int i = 1; i < size; i++) {
            int key = numbers[i]; 
            int j = i - 1;
            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j--;
            }

            numbers[j + 1] = key; 
        }

        System.out.println("After Sorting:");
        print(numbers, size);
    }

    public static void print(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
