public class TruncateSentence {
    public static void main(String[] args) {
      String s = "Hello how are you Contestant";
      int k = 4;
      System.out.println(truncateSentence(s,k));

    }
    public static String truncateSentence(String s, int k) {
        String sencence = "";
        String[]words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < k; i++){

                sb.append(words[i]).append(" ") ;
        }
        return  sb.toString().trim();

    }
}
