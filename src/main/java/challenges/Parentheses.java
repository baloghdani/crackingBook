package challenges;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by danielbalogh on 6/21/17.
 */

//Implement an algorithm to print all valid combinations of n pairs of parentheses
public class Parentheses {

    public void addParen(ArrayList<String> list, int leftRem, int rightRem, char[] str, int index) {

        if(leftRem<0 || rightRem<leftRem) {
            return;
        }

        if(leftRem == 0 && rightRem == 0) {
            list.add(String.copyValueOf(str));
        }

        else {
            str[index] = '(';
            addParen(list,leftRem-1, rightRem,str,index+1);

            str[index] = ')';
            addParen(list,leftRem,rightRem-1,str,index+1);
        }

    }

    ArrayList<String> generateParens(int count) {
        char[] str = new char[count*2];
        ArrayList<String> list = new ArrayList<String>();
        addParen(list,count,count,str,0);
        return list;
    }

    public static void main(String[] args) {
        Parentheses test = new Parentheses();
        test.generateParens(6);
        System.out.println(test.generateParens(6));
    }
}
