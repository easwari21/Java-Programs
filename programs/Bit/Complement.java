public class Complement {
    public static void main(String[] args) {

        int a=6;
        int ans=~a;
        int mask=0;
        while(mask<a){
            mask=(mask<<1)|1;
        }
        ans=ans&mask;
        System.out.println(ans);

    }
}