public class Powerof2 {
    public static void main(String[] args) {
          // write a program to print power of 2^n
          int n=2;
          System.out.println("Power of 2: ");
          for(int i=2;i<=500;i++)
          {
              if((i &(i-1))==0)
              {
                  System.out.println(i);
              }
             
          }
    }
    
}
