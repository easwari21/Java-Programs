public class Shift {
    public static void main(String[] args) {
        //In right shift,the value decreses by 2^n
        //In left shift,the value increases by 2^n
        //<<--increases(multiplication)
        //>>--decreases(division)
        int a=10;
        int b=a<<1;
        int c=a>>1;
        System.out.println("Right Shift: " + b);
        System.out.println("Left Shift: " + c);

        
    }
}
 