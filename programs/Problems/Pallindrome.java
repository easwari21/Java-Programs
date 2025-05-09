import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
        int b, rem, rev = 0,a;
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter a number: ");
        a = scanner.nextInt(); 
        b = a; 
        while (a != 0) 
        {
            rem = a % 10;
            rev = rev * 10 + rem;
            a = a / 10;
        }
        if (b == rev) {
            System.out.println("The number is a palindrome");
        } else {
            System.out.println("The number is not a palindrome");
        }
        scanner.close(); 
    }
}
