public class PosNegsum {
    static int[] getPosNegSum(int[] arr){
        int Possum = 0;
        int Negsum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                Possum = Possum + arr[i];
            }
            else {
                Negsum = Negsum + arr[i];
            }
        }
        int ans[] = {Possum , Negsum};
        return ans;
    }


    static void main() {
        int arr[] = {2,-1,5,-25,23};
        int ans[] = getPosNegSum(arr);
        System.out.println("Possum :"+ans[0]);
        System.out.println("NegSum :"+ans[1]);
    }
}
