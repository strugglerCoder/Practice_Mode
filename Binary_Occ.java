/**
 * Binary_Occ
 */
public class Binary_Occ {

    public static void main(String[] args) {
        
        int arr[] = {1,1,1,1,0,1,1,1};
        int max = 0, cnt = 0;
        
        
        for (int i = 0; i < arr.length; i++) {
            
            if(arr[i] == 0)
                cnt = 0;
            else
                cnt++;
            if(cnt > max)
                max = cnt;
        }
        System.out.println(max);
    }
}