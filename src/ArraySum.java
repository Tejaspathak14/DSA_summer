public class ArraySum {
    static void main() {
        int [] arr = {2,5,10,100};
        int sum = 0;

        for (int i = 0; i <arr.length ; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
