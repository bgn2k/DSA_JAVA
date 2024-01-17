package Searching.RotatedArrSearch;

public class Tester {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int k = 0;
        int ind = getIndex(arr,k);
        System.out.println("Element " + k + " found at the index: " + ind);
    }

    private static int getIndex(int[] arr, int k) {
        int n= arr.length;
        int low = 0, high = n-1;
        while (low <= high) {
            int mid = (low + high)/2;
            if(arr[mid] == k)
                return mid;
            if(arr[low] <= arr[mid]){
                if(arr[low] <= k && k < arr[mid])
                    high = mid -1;
                else    
                    low = mid + 1;
            }
            else{
                if(arr[mid] <= k && k < arr[high])
                    low = mid -1 ;
                else
                    high = mid + 1;
            }
        }
        return -1;
    }
}
