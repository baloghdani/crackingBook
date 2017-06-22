package challenges;
import java.util.*;

/**
 * Created by danielbalogh on 6/22/17.
 */

//You have an array of numbers.
//Your task is to sort ascending odd numbers but even numbers must be on their places.
// Zero isn't an odd number and you don't need to move it.
// If you have an empty array, you need to return it.


public class SortTheOdd {

    public int[] sort(int[] array) {

        ArrayList<Integer> odds = new ArrayList<Integer>();

        for (int i=0; i<array.length; i++) {
            if (array[i] % 2 != 0) {
                odds.add(array[i]);
            }
        }

        java.util.Collections.sort(odds);

        int j = 0;

        for (int i=0; i<array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = odds.get(j);
                j++;
            }
    }
        return array;
    }

    public static void main(String[] args) {
        SortTheOdd sort = new SortTheOdd();
        int[] testArr = {3, 24, 76, 2, 4, 9, 55, 126, 77, 147};
        System.out.println(Arrays.toString(sort.sort(testArr)));
    }
}
