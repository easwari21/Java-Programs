public class Reversebits {
    //My logic
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();
        int reverse = 0;
        int bits = Integer.SIZE; 

        for (int i = 0; i < bits; i++) {
            reverse<<= 1; 
            reverse |= (n & 1); 
            n >>= 1; 
        }

        System.out.println("Reversed: " + reverse);
        
    }
}
