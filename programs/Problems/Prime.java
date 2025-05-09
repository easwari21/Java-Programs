public class Prime 
{
    public static void main(String[] args) 
    {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int count = 0;
        System.out.print("Prime numbers ");
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) 
        {
            isPrime[i] = true; 
        }

        for (int i = 2; i * i <= n; i++) 
        {
            if (isPrime[i]) 
            {
            for (int j = i * i; j <= n; j = j + i) 
            {
                isPrime[j] = false; 
            }
            }
        }

        for (int i = 2; i <= n; i++) 
        {
            if (isPrime[i]) 
            {
            System.out.print(" " + i);
            count++;
            }
        }
        System.out.print("\nCount : " + count);
    }
}

