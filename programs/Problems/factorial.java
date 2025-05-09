public class factorial {
    public static void main(String[] args) 
    {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter number 1: ");
        int n= scanner.nextInt();
        int a=1;
        for(long i=1;i<=n;i++)
        {
            a *= i;
        }
        System.out.println(a);
        int zeroCount = 0;
        int temp = a;
        while (temp % 10 == 0) {
            zeroCount++;
            temp /= 10;
        }
        System.out.println("Number of trailing zeroes: " + zeroCount);
        }
        
    }
