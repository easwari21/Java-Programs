public class HowmanyOnes {
    public static void main(String[] args) {
        //find no of one's in the binary number
        int n=1;
        int mask=1;
        int ans=0;
        for(int i=0;i<32;i++)
        {
           if((n&mask)!=0)
                {
                    ans++;
                }
                mask=mask<<1;
            }
        System.out.println(ans);
    }
    
}
