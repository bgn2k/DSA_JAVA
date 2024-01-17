package GFG_Problems.Arrays.FreqOfElementInArr;

import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        int arr[] = {10,20,20,30,10};
        getFreq(arr);
    }

    private static void getFreq(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;

        int freq = 1;
        int i =  1;
        while(i < n){
            while(i < n && arr[i] == arr[i-1]){
                freq++;
                i++;
            }
            System.out.println(arr[i-1] + " " + freq);
            freq = 1;
            i++;
        }
        if( n == 1 || arr[i - 1] != arr[i-2]){
            System.out.println(arr[i-1] + " " + freq);
        }
    }
}
