package GFG_Problems.Arrays.MaximizeProfits;

public class Tester {
    public static void main(String[] args) {
        // int prices[] = {
        //         7, 1, 5, 3, 6, 4
        // };
        int prices[] = {2,4,1};
        System.out.println("\nMax Profit: " + getProfits(prices));
    }

    private static int getProfits(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }
        int small = 0;
        int smallInd = 0;
        int res = prices[0];
        // 7,1,5,3,6,4
        // Finding the smallest element:
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[i - 1]) {
                small = prices[i];
                res = Math.min(res, small);
            }
        }
        // Finding the smallest element's index:
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == res) {
                smallInd = i;
            }
        }
        // System.out.println("Smallest Element: " + res + " and its index: " + smallInd);
        int maxRes = res;
        int max = 0;

   
            // Finding the largest element from the small Index:
            for (int i = smallInd + 1; i < prices.length; i++) {
                if (prices[i] > prices[i - 1]) {
                    max = prices[i];
                    maxRes = Math.max(maxRes, max);
                }
            }
            // System.out.println("Largest Element: " + maxRes);
            // Finding the maxDiff:
            int profit = maxRes - res;
            return profit;
        

    }
}
