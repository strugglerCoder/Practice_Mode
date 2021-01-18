public class ReverseInt {
    public static void main(String[] args) {
        long x = 1534236469;

        if (x < 0) {
            x = Math.abs(x);
            System.out.println("-" + reverse(x));
        } else {
            System.out.println(reverse(x));
        }
    }

    static long reverse(long x) { 
        long a = 0, ans = 0;
        while (x > 0) {
            a = x % 10;
            ans = ans * 10 + a;
            x = x / 10;
            System.out.println(a +" : " +ans);
        }
        return (ans);
    }
}
