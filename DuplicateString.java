/**
 * DuplicateString
 */
public class DuplicateString {

    public static void main(String[] args) {
        String str = "goodmorning";
        StringBuilder sb = new StringBuilder();
        int idx = 0;

        for ( int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            idx = str.indexOf(c, i+1);
            if (idx == -1) {
                sb.append(c);    
            }
        }
         
        System.out.println(sb);

    }
}