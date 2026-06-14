public class ArrayMultiple {
    static void main() {
        int [] arr = {2,10,15,1222};
        int ans = 1;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int value = arr[i];
            ans = ans * value;
        }
        System.out.println(ans);
    }
}
