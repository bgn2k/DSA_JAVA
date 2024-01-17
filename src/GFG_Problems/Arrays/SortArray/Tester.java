package GFG_Problems.Arrays.SortArray;

public class Tester {
    public static void main(String[] args) {
        int[] nums = {5,2,3,1};
        int arr[] = new int[nums.length];
        arr = sortArray(nums);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static int[] sortArray(int[] nums) {
        int arr[] = new int[nums.length];
        arr = quickSort(nums, 0, nums.length -1);
        return arr;
    }

    private static int[] quickSort(int[] nums, int i, int j) {
        if(i < j){
            int p = partition(nums, i,j);
            quickSort(nums, i, p);
            quickSort(nums, p+1, j);
        }
        return nums;
    }

    private static int partition(int[] nums, int i, int j) {
        int p = nums[i];
        int left = i-1, right = j+1;
        boolean partition = false;
        while(!partition){
            do{
                left++;
            }while(nums[left] < p);
            do {
                right--;
            } while (nums[right] > p);
            if(right <= left){
                partition =true;
                return right;
            }
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
        return -1;
    }
}
