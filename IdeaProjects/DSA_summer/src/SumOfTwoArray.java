import java.util.Scanner;

public class SumOfTwoArray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[3][4];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("row :" + i + "column :");
                arr[i][j] = sc.nextInt();
                int value = arr[i][j];
                sum = sum + value;
            }
        }
        System.out.println(sum);
    }
}
