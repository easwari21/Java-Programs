public class root {

    public static void main(String[] args) 
    {
        double number=28;
        double root=3;
        double left=0;
        double right=number;
        double middle=0;            
        double error=0.0001;
        while((right-left)>error){
            middle=(left+right)/2;
            if(multiply(middle,root)>number){
                right=middle;
            }
            else{
                left=middle;
            }
        }
        middle=(left+right)/2;

        System.out.println("Root is" +middle);
        
    }

public static double multiply(double number, double root) {
    double multValue = 1;
    for (int i = 0; i < root; i++) {
        multValue = multValue * number;
    }
    return multValue;
}
}