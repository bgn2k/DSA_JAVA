package Sorting.Partition;

public class Tester {
    public static void main(String[] args) {
        int arr[] = {3,8,6,12,10,7};
        int k = 5;
        getPartition(arr,k);
    }
    //NAIVE APPROACH
    private static void getPartition(int[] arr, int k) {
        int temp[] = new int[arr.length]; int index = 0;
        for (int i = 0; i < temp.length; i++) {
            if(arr[i] <= arr[k]){
                temp[index] = arr[i];
                index++;
            }
        }
        for (int i = 0; i < temp.length; i++) {
                if(arr[i] > arr[k]){
                temp[index] = arr[i];
                index++;
            }
        }
        for (int i : temp) {
            System.out.println(i);
        }
    }
}
