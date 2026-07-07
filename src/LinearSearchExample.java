import java.util.Scanner;

public class LinearSearchExample {
    static boolean findTarget(int[] arr, int target){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] == target){
                return true;
            }
        }
        //if not then false
        return false;
    }

    static void main() {
        int[] arr = {2,5,6,9};
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter arr size:");
//        int n = sc.nextInt();
////        System.out.println("enter arr size:");
//        int [] arr = new int[n];
//        System.out.println("enter array element :");
////        boolean ans = findTarget(arr, 9);
//        for (int i = 0; i <arr.length ; i++) {
//            arr[i] = sc.nextInt();
//        }
        boolean ans = findTarget(arr, 9);
        System.out.println(ans);

    }
}
