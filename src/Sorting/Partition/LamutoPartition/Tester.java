package Sorting.Partition.LamutoPartition;

public class Tester {
    public static void main(String[] args) {
        int arr[] = { 10, 80, 30, 90, 40, 50, 70 };
        int l = 0, r = arr.length - 1;
        System.out.println("Index of partition element: "+getIndexOfPivot(arr, l, r));
        // ;

    }

    private static int getIndexOfPivot(int[] arr, int l, int r) {
        int i = l - 1;
        int pivot = arr[r];
        for (int j = l; j <= r; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr,i+1, r);
        System.out.println("\n\n");
        for (int j : arr) {
            System.out.println(j);
        }
        return i + 1;
    }

    private static void swap(int arr[], int i, int j) {
            int temp = 0;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        

    }
}
