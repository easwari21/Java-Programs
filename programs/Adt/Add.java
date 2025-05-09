public class Add {
    public static void main(String[] args) {
        int[] num = new int[5]; 
        int size = 0; 
        num[size++] = 10;
        num[size++] = 20;
        num[size++] = 30;
        System.out.println("Result:");
        for (int i = 0; i < size; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
