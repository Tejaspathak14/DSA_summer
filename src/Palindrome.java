public class Palindrome {
    static String reverseString(String str){
        String reverse = "";
        int n = str.length();
        for (int i = n-1; i >=0 ; i--) {
            char ch = str.charAt(i);
            reverse = reverse + ch;

        }
        return reverse;
    }




    static boolean isPalindrome(String str){
        String original = str;
        String reverse = reverseString(original);
        //compare

        for(int i = 0;i<original.length();i++){
            char ch1  = original.charAt(i);
            char ch2 = reverse.charAt(i);
            if(ch1 != ch2){
                return false;
            }
        }
        return true;
    }


    static void main() {
        String str = "moom";
        System.out.println(isPalindrome(str));

    }
}
