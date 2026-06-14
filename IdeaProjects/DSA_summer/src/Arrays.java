public class Arrays {
    public static void main(String[] args) {
//        int [] arr = {5,12,-10,15,6};
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//        }
//        System.out.println(sum);


        int [] arr = {1,23,45,76};
        int ans = 1;
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            int value =  arr[i];
            ans = ans * value;
        }
        System.out.println(ans);



        //
//        //decalarion
//        int arr[];
//
//        // allocation
//        arr = new int[5];
//
//        //initallization
//
//        int brr[] = {10,20,30};
//       // System.out.println("value of 0 index : "+brr[0]);
//        int n = brr.length;

       // for(int index = 0; index <= n-1;index++){
         //   System.out.println(brr[index]);
        //
        // }
//        for(int val : brr){
//            System.out.println(val);
//        }


    }
}
