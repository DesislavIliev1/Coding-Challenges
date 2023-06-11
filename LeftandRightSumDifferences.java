import java.util.Arrays;

public class LeftandRightSumDifferences {
    public static void main(String[] args) {
        int[]nums = {10,4,8,3};
        System.out.println(Arrays.toString(leftRightDifference(nums)));

    }
    public static int[] leftRightDifference(int[] nums) {

        int k = 0;
        int sumNums = 0;
        int n = nums.length-1;
        int[]leftSum = new int[nums.length];
        int[]rightSum = new int[nums.length];
        int[]answer = new int[nums.length];


        for (int i = 0; i < nums.length ; i++) {
          sumNums += nums[i];
        }
        int sum2Nums = sumNums;

        for(int j = n ; j >=0; j--){
             sumNums -= nums[j];
            leftSum[j] = sumNums;

            sum2Nums -= nums[k];
            rightSum[k] = sum2Nums;
            k++;
        }

        for (int l = 0; l < nums.length ; l++) {
            answer[l] = Math.abs(rightSum[l] - leftSum[l]);
        }
        return answer ;

    }
}
