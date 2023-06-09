import java.util.List;

public class DiagonalDifferences {
    /*Given a square matrix, calculate the absolute difference between the sums of its diagonals.

    For example, the square matrix  is shown below:

            1 2 3
            4 5 6
            9 8 9
    The left-to-right diagonal = . The right to left diagonal = . Their absolute difference is .

    Function description

    Complete the  function in the editor below.

    diagonalDifference takes the following parameter:

    int arr[n][m]: an array of integers
    Return

    int: the absolute diagonal difference
    Input Format

    The first line contains a single integer, , the number of rows and columns in the square matrix .
    Each of the next  lines describes a row, , and consists of  space-separated integers .

     */
    public static void main(String[] args) {

    }
    public static int diagonalDifference(List<List<Integer>> arr) {
        int leftDiagonalSum = 0;
        for(int i = 0; i < arr.size(); i++) { //O(n)
            leftDiagonalSum += arr.get(i).get(i);
        }



        int rightDiagonalSum = 0;
        for(int i = 0; i < arr.size(); i++) { //O(n)
            rightDiagonalSum += arr.get(i).get((arr.size()-1) - i);
        }

        return Math.abs(leftDiagonalSum - rightDiagonalSum);
    }

}

