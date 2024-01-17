package Arrays.RotatedArr;
// Pgm to find out the by how many time the array is being rotated.
public class Tester {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int noOfRotation = getCount(arr);
        System.out.println("No of Rotation: " + noOfRotation);

    }

    private static int getCount(int[] arr) {
        int minArr = getMin(arr);
        for(int i = 0; i< arr.length;i++){
            if(arr[i] == minArr)
                return i+1;
        }
        return 0;
    }

    private static int getMin(int[] arr) {
        int ans = Integer.MAX_VALUE;
        int l = 0, r = arr.length - 1;
        while(l <= r){
            int mid = (l + r)/2;
            if(arr[l] < arr[mid]){
                ans = Math.min(ans, arr[l]);
                l = mid + 1; //The min may or may not be in the sorted half so we took the one element from the sorted half and now we need to check whether there is min element in the unsorted half.

            }
            else{
 
                ans = Math.min(ans, arr[r]);
                r = mid - 1;// In this we check for the 2nd Sorted half and take the lowest element from here and then eleminate the rest
            }
        }
        return ans;
    }
}
