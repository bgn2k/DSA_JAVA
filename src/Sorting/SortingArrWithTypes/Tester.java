package Sorting.SortingArrWithTypes;

public class Tester {
    public static void main(String[] args) {
        // int arr[] = { 15, -3, -2, 18 };
                int arr[] = {-12,18,-10, 15 };

        // System.out.println(arr[-1]);
        // Func obj = new Func();
        Func.getArr(arr);
        for (int i : arr) {
            System.out.println(i);
        }

    }
}

class Func {
    public static void getArr(int arr[]) {
        //-12,18,-10, 15 
        int i = -1, j = arr.length; //j =4
        while (true) {
            do {
                i++;
            } while (arr[i] < 0);// it will stop at i =1
            do {
                j--;
            } while (arr[j] >= 0);// j wil stop at j = 2
            if (i >= j)
                return;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;//@1st iteration 18 will swap with -10

        }

    }
}
