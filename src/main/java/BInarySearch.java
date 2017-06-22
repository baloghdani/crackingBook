/**
 * Created by danielbalogh on 6/20/17.
 */
public class BInarySearch {

    public int search(int[] arr, int targetValue){
        int min = 0;
        int max = arr.length-1;
        while(min<=max) {
            int guess = (min+max) / 2;
            if(arr[guess] == targetValue){
                return guess;
            }
            else if(arr[guess] < targetValue) {
                min = guess+1;
            }
            else {
                max = guess-1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        BInarySearch bs = new BInarySearch();
        int[] testArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(bs.search(testArr, 4));
    }
}
