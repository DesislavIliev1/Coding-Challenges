import java.util.Arrays;
import java.util.List;

public class LonelyInteger {
    /*Given an array of integers, where all elements but one occur twice, find the unique element.

    Example

    The unique element is .

    Function Description

    Complete the lonelyinteger function in the editor below.

    lonelyinteger has the following parameter(s):

    int a[n]: an array of integers
    Returns

    int: the element that occurs only once
    Input Format

    The first line contains a single integer, , the number of integers in the array.
    The second line contains  space-separated integers that describe the values in .

     */
    public static void main(String[] args) {
        List<Integer>arr = Arrays.asList(0, 0, 1, 2, 1);
        System.out.println(lonelyinteger(arr));

    }
    public static int lonelyinteger(List<Integer> arr) {
        int sumTwice = 0;
        int sum = 0;
        int num = 0;
        for(int i = 0; i < arr.size(); i++){
            sum += arr.get(i);

            for(int j = 1+i; j < arr.size(); j++){
                if(arr.get(i) == arr.get(j)){
                    sumTwice += arr.get(j)*2;
                }
            }
        }
        num = sum - sumTwice;
        return num;

      

    }
}
