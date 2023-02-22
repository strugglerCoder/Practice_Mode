import java.util.Scanner;
/**
 * LastDigit
 */
public class LastDigit {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        int n = sc.nextInt();
        int lst = n%10;
        System.out.println(lst);
    }
}
