public class Stringextra {
    public static void main(String[] args) {
        //Given two strings,both are same but the second string has an extra letter in it,find and return the letter
        String a = "java";
        String b = "javac";
        int count=0;
        for(int i=0;i<5;i++)
        {
            if(a!=b)
            {
                 count++;
            }
        }
        System.out.println(count);
    }
    
}
