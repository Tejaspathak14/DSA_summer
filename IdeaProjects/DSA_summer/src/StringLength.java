public class StringLength {
    static int getLengthofString(String str){
        char[] arr = str.toCharArray();
        int len = arr.length;
        return len;
    }


    static void main() {
        String str = "Love";
        System.out.println(getLengthofString(str));

    }
}
