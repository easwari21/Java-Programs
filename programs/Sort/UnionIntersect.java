public class UnionIntersect {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {3, 4, 5, 6};
        System.out.println("Union of Arrays:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        for (int i = 0; i < array2.length; i++) {
            boolean found = false;
            for (int j = 0; j < array1.length; j++) {
                if (array2[i] == array1[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print(array2[i] + " ");
            }
        }
    }
}
