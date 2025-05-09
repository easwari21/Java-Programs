public class Hammingdistance {
//using xor,return count of numbers which has 1 in result of xor 
    public static void main(String[] args) {
        int n = 8;
        int m = 9;
        int count = 0;
        int ans = n ^ m;
        for (int i = 0; i < 4; i++) {
            if (ans == 1) {
                count++;
            }
        }
        System.out.println("Hamming distance: " + count);
    }
}
