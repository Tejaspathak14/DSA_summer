import java.util.Scanner;

public class StringExample {
    static String reverseString(String str){
        String reverse = "";
        int n = str.length();
        for (int i = n-1; i>=0; i--) {
            char ch = str.charAt(i);
            reverse = reverse + ch;

        }
        return reverse;
    }





    static void main() {
        String str = "love";
        System.out.println(reverseString(str));
//        String str = "Tejas";
//        String str1 = "Pathak";
//        System.out.println(str + " " + str1);
//        System.out.println(str.length());
//        System.out.println(str.charAt(1));


//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        System.out.println("Value of next :" + str);
//        String str1 = sc.next();
//        System.out.println("Value :" + str1);
//
//
//        String str = "   Tejas  ";
//        System.out.println(str.length());
//        System.out.println(str.charAt(2));
//        System.out.println(str.substring(1,5));
//        System.out.println(str.isBlank());
//        System.out.println(str.isEmpty());
//        System.out.println(str.trim());
//        System.out.println(str.contains("s"));
//        System.out.println(str.toLowerCase());
//        System.out.println(str.replace("Tejas","Pathak"));
//        System.out.println(str.toCharArray());
        ;
//        int n = 54321;
//        String s = String.valueOf(n);
//        System.out.println(n+1);
//        System.out.println(s+1);
//
//        String input = "My,name,is,tejas,pathak";
//        String[] word = input.split(",");
//        for(String str: word ){
//            System.out.println(str);
//        }
        }
    }
