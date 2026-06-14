public class MaxElement {
    static void main() {
        int [] arr = {10,2,3,4};
        int n = arr.length;
        int maxValue = arr[0];

        for (int i = 0; i < n-1; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
            System.out.println(maxValue);
    }
}