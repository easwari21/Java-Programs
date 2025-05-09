import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class MergeSort {
    public static void main(String[] args) {
        ArrayList<Integer> arr1=new ArrayList<>(Arrays.asList(19, 3, 5, 7));
        ArrayList<Integer> arr2=new ArrayList<>(Arrays.asList(2, 4, 67, 8));
        ArrayList<Integer> mergedArray=new ArrayList<>();
        int i = 0, j = 0;
        while (i < arr1.size() && j < arr2.size()) {
            mergedArray.add(arr1.get(i));
            i++;
            mergedArray.add(arr2.get(j));
            j++;
        }
        Collections.sort(mergedArray);
        System.out.println("" + mergedArray);

    }
}
    