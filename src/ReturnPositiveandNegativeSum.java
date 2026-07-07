public class ReturnPositiveandNegativeSum {
    static int[] getPosNegSum(int[] arr){
        int posSum = 0;
        int NegSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0){
                posSum = posSum + arr[i];
            }
            else{
                NegSum = NegSum + arr[i];
            }
        }
        int ans[] = {posSum,NegSum};
        return ans;
    }


    static void main() {
        int[] arr = {2,-5,7,-9};
        int ans[] = getPosNegSum(arr);
        System.out.println("Positive sum :"+ans[0]);
        System.out.println("Negative sum :"+ans[1]);

    }
}
