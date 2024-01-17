package Sorting.KthSmallestElement;

public class Tester {
    public static void main(String[] args) {
        int arr[] = {
            10,4,5,8,11,6,26
        };
        int k = 7;
        System.out.println(arr[getKthSmallestElement(arr, k)]);
    }

    private static int getKthSmallestElement(int[] arr, int k) {

        int l = 0, h = arr.length - 1;
        int pivot = 0;
        while(l <= h){
            pivot = getPartition(arr, l, h);
            if(pivot == k - 1)
                return pivot;
            else if(pivot <= k - 1)
                l = pivot + 1;
            else
                h = pivot - 1;
            
        }
        return -1;
    }

    private static int getPartition(int[] arr, int l, int h) {
        int pivot = arr[l];
        int left = l - 1, right = h + 1;
        while (true) {
            do {

                left++;

            } while (arr[left] < pivot);
            // while(arr[right] > pivot){
            do {
                right--;
            } while (arr[right] > pivot);

            // }
            if (left >= right) {
                // swap(arr, left, right);
                return right;
            }
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
    }
}
