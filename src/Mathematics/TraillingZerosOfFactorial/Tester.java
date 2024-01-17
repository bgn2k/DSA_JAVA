package Mathematics.TraillingZerosOfFactorial;

public class Tester {
    public static void main(String[] args) {
        int n = 75;
        int ans = getAns(n);
        System.out.println("Trailling Zeros Of Facorial : " + n + " is: " + ans);
    }

    private static int getAns(int n) {
        int ans = 0;
        boolean flag = true;
        // while (flag == true) {
        //     ans += n / 5;
        //     if(ans % 5 != 0)
        //         flag = false;
        // }
        for (int i = 5; i <= n; i =i*5) {
            ans += n/i;
        }
        return ans;
    }
}
