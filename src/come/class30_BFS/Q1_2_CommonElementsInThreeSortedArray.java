package come.class30_BFS;

import java.util.ArrayList;
import java.util.List;

public class Q1_2_CommonElementsInThreeSortedArray {
    public List<Integer> common(int[] a, int[] b, int[] c) {
        List<Integer> res = new ArrayList<>();
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length && k < c.length) {
            if (a[i] == b[j] && b[j] == c[k]) {
                res.add(a[i]);
                i++;
                j++;
                k++;
            } else if (a[i] <= b[j] && a[i] <= c[k]) {
                i++;
            } else if (b[j] <= a[i] && b[j] <= c[k]) {
                j++;
            } else {
                k++;
            }
        }
        return res;
    }
}
