import java.util.ArrayList;
import java.util.Arrays;

public class DecompressRunLengthEncodedList {
    public static void main(String[] args) {
       int[] nums = {65,44,72,15};
       System.out.println(Arrays.toString(decompressRLElist(nums)));

    }

    public static int[] decompressRLElist(int[] nums){
        int totalfreq = 0;


        //length of the new array
        for (int i = 0; i < nums.length; i+=2) {
            totalfreq +=nums[i];
        }
        int[]arr = new int[totalfreq];

        int count = 0;
        for (int i = 0; i < nums.length; i+=2) {
            int freq = nums[i];
            int val = nums[i+1];
            for(int j= 0; j < freq; j++){
                arr[count++] = val;
            }
        }
        return arr;
     }
}
