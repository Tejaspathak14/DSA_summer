public class Maxelement1 {
    static int getMaximum(int[] arr){
        int max = arr[0];
        for (int i = 0; i <arr.length ; i++) {
//            if(arr[i] > max){
//                max = arr[i];
//            }
            max = Math.max(max,arr[i]);
        }
        return max;
    }

    static void main() {
        int[] arr = {2,65,6,10,3};
        System.out.println(getMaximum(arr));

    }
}
