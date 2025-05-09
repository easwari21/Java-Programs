public class Bitreverse{
    public static void main (String[] args) {
    //Easy logic
        int n=1;
        int reverse = 0;
        for(int i=0;i<32;i++){
            int last=n&1;
            if(reverse!=0){
                reverse=reverse<<1; 
            }
            if(last==1){
                reverse=reverse|1;
            }
            n=n>>1;
    }
    System.out.println("Reversed: " + reverse);

}
}
