public class multiply {
    public static void main(String[] args) 
    {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter number 1: ");
        System.out.print("Enter number 2: ");
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        for(int i=0;i<=n;i++)
        {
            a=a+i;
        }
        System.out.println(a);
        
    }
}