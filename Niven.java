public class Niven {
    public static void main(String[] args) {
        int n = 72, digit = 0, sum = 0;
        int n2 = n;

        while (n2 > 0) {
            digit = n2 % 10;
            sum = sum + digit;
            n2 = n2 / 10;
        }

        if (n % sum == 0) {
            System.out.println("suc : " + n / sum);
        } else {
            System.out.println("remaining " + n % sum);
        }
    }
}
