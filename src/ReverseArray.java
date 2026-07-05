
//Two Pointer

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter array elements:");

        for (int i = 0; i <=arr.length-1 ; i++) {
            arr[i] = sc.nextInt();
        }

        int start =0, end = arr.length-1;
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr)+"");
    }
}
