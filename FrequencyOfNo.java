/**
 * FrequencyOfNo
 */
public class FrequencyOfNo {

    public static void main(String[] args) {
        
        int n = 1552554;
        int key = 5, cnt = 0, rem = 0;

        while (n>0) {
            rem = n%10;
            if (rem == key) {
                cnt++;
            }
            n = n/10;
        }
        System.out.println(cnt);
  
}
}