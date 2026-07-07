public class MultipleArray {
    static int[] multipleBy10(int[] arr){
        int size = arr.length;
        int newarray[] = new int[size];

        for (int i = 0; i <size ; i++) {
            int element = arr[i];
            int newelement = element * 10;
            newarray[i] = newelement;
        }
        return newarray;
    }



    static void main() {
        int[] arr = {2,5,10,4};
        int ans[] = multipleBy10(arr);
        System.out.println("new array :");
        for(int i:ans){
            System.out.println(i);
        }

    }
}
