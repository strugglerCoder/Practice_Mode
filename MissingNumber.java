public class MissingNumber {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {3,1,5,2};
        int sum = 0, sum2 = 0;
        
        for(int i=1; i<=n; i++)
        {
          sum += i;
        }
        
        for(int i=0; i<arr.length; i++)
        {
          sum2 += arr[i];
        }
        
        System.out.println(sum-sum2);
    }
}
