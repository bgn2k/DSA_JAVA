package Sorting.QuickSort;

public class Tester {
    public static void main(String[] args) {
        // int arr[] = { 4, 6, 2, 5, 7, 9, 1, 3 };
        int arr[] = {8,4,7,9,3,10,5};
        int l = 0, r = arr.length - 1;
        qSort(arr, l, r);
        for (int i : arr) {
            System.out.println(i);
        }

    }

    public static void qSort(int[] arr, int l, int r) {
        int p;
        if (l < r) {
            p = getPartition(arr, l, r);
            qSort(arr, l, p);
            qSort(arr, p + 1, r);
        }
    }

    public static int getPartition(int[] arr, int l, int r) {
        int pivot = arr[l];
        int left = l - 1, right = r + 1;
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
        // arr[l] = arr[right];
        // arr[right] = pivot;
        // return pivot;
    }

    // private static void swap(int[] arr, int left, int right) {
    // int temp = arr[left];
    // arr[left] = arr[right];
    // arr[right] = temp;
    // }
}
