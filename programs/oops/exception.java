public class exception {
    public static void main(String[] args) {
        int n1=20;
        int n2=3;
        int div=0;
        try {
            div=n1/n2;
            
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("NO Division by zero");
        } finally {
            System.out.println("Finally block executed");
        }
        System.out.println(div);
}
}
