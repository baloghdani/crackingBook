package challenges;

/**
 * Created by danielbalogh on 6/20/17.
 */

//implement an algorithm to determine if a string has all unique characters
public class IsUnique {

    public boolean isUnique(String str) {
        for (int i=0; i<str.length(); i++) {
            char charAtPosition = str.charAt(i);
            int counter = 0;
            for (int j=i; j<str.length(); j++) {
                if(str.charAt(j)== charAtPosition) {
                    counter++;
                }
            }
            if(counter>1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String testString = "abcdefgh";
        String testString2 = "abcdefghh";
        IsUnique iu = new IsUnique();
        System.out.println(iu.isUnique(testString));
        System.out.println(iu.isUnique(testString2));
    }
}
