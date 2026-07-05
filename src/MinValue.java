public class MinValue {
    static void main() {
        int [] arr = {10,20,3,4};
        int n = arr.length;
        int minVal = arr[0];

        for (int i = 0; i <= n-1; i++) {
            if (arr[i]< minVal){
                minVal = arr[i];
            }
        }
        System.out.println(minVal);
    }
}
