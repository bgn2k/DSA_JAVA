package Arrays.ReverseArray;

public class Tester {
    public static void main(String[] args) {
        int arr[] = {10,12,13,15,30};
        reverseArr(arr);
    }

    private static void reverseArr(int[] arr) {
        int l = 0, r = arr.length - 1;
        do {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;r--;            
        } while (l<=r);
        for (int i : arr) {
            System.out.println(i);
        }
     
    }
}
