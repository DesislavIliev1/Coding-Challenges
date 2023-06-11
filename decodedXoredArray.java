import java.util.Arrays;

public class decodedXoredArray {
    public static void main(String[] args) {

        int[] encoded = {1,2,3};
        int first = 1;

        System.out.println(Arrays.toString(decode(encoded,first)));


    }

    public static int[] decode(int[] encoded, int first) {
        int[] decode = new int[encoded.length+1];
        decode[0] = first;
        for (int i = 1; i < encoded.length; i++) {
            decode[i+1] = encoded[i]^decode[i];

        }
        return decode;

    }
}
