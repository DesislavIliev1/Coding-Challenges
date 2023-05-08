import java.util.HashSet;

public class Pangrams {
   /* A pangram is a string that contains every letter of the alphabet. Given a sentence determine whether it is a pangram in the English alphabet. Ignore case. Return either pangram or not pangram as appropriate.

    Example

    The string contains all letters in the English alphabet, so return pangram.

            Function Description

    Complete the function pangrams in the editor below. It should return the string pangram if the input string is a pangram. Otherwise, it should return not pangram.

    pangrams has the following parameter(s):

    string s: a string to test
    Returns

    string: either pangram or not pangram
    Input Format

    A single line with string .

    */
    public static void main(String[] args) {
        String s = "We promptly judged antique ivory buckles for the next prize";
        System.out.println(pangrams(s));

    }
    public static String pangrams(String s) {
        s = s.replace(" ", "");
        s = s.toLowerCase();

        HashSet<Character> elems = new HashSet<>();
        char[] alphs = s.toCharArray();

        for (char c : alphs){
            elems.add(c);
        }

        if (elems.size() == 26){
            return "pangram";
        }
        return "not pangram";
    }

    // Write your code here

}


