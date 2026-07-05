import java.util.Scanner;

public class TwoDArray {
//    static void main() {
//        int [][] arr;
//        //allocation
//        arr = new int[3][4];
//        //init
//        int [][] brr = {
//                {1,2},
//                {3,4},
//                {5,6},
//                {7,8}
//        };
////        System.out.println(brr[2][1]);
//// print all the elements in the matrix of array
//
//    int rowLength = brr.length;
//    int collength = brr[0].length;
//
//    for (int rowi = 0; rowi <= rowLength-1; rowi++) {
//        for (int colj = 0; colj <= collength-1; colj++) {
//            System.out.print(brr[rowi][colj]+" ");
//        }
//        System.out.println();
//        }
//    }
//}
    static void main() {
//        int [][] arr;
//        arr = new int[3][4];
//        int [][] brr = {
//                {1,2,3},
//                {3,4,5,6},
//                {7,8,9,10,15,16},
//                {4}
//                    };
//        int rowLength = brr.length;
//
//        for (int rowi = 0; rowi <= rowLength-1; rowi++) {
//
//            int colLength = brr[rowi].length;
//
//            for (int columnj = 0; columnj <= colLength-1 ; columnj++) {
//                System.out.print(brr[rowi][columnj]+" ");
//            }
//            System.out.println();
//        }
//
//        int [][] arr = new int[5][];
//
//        arr[0] = new int[]{2, 5, 6, 7};
//        arr[1] = new int[]{7,5,12,23,24,25,20,30};
//        arr[2] = new int[]{4,5,6,1,4,2};
//        arr[3] = new int[]{4};
//        arr[4] = new int[]{4,2};
//
//        int rowLength = arr.length;
//
//        for (int row = 0; row <=rowLength-1 ; row++) {
//            int colLength = arr[row].length;
//            for (int col = 0; col <=colLength-1 ; col++) {
//                System.out.print(arr[row][col]+"  ");
//            }
//            System.out.println();
//        }

        //traversal 2-D Array

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[][] = new int[3][4];
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                System.out.println("Provide value for row =" + i + "Provide value for column ");
                arr[i][j] = sc.nextInt();
            }
        }


        for (int rowIndex = 0; rowIndex <= arr.length-1 ; rowIndex++) {
            for (int columnIndex = 0; columnIndex <=arr[rowIndex].length-1 ; columnIndex++) {
                System.out.print(arr[rowIndex][columnIndex]+" ");
            }
            System.out.println();
        }



}

}