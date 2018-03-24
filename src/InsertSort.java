import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] ary = {31, 41, 59, 26, 41, 58};   // {5, 2, 4, 6, 1, 3};
        for (int i = 1; i < ary.length; i++) {
            int key = ary[i];
            int j = i - 1;
            while (j >= 0 && ary[j] < key) {
                ary[j + 1] = ary[j];
                j = j - 1;
            }
            ary[j + 1] = key;
        }
        System.out.print(Arrays.toString(ary));
    }
}
