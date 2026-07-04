public class StringLength {

    static int getLengthofString(String str) {
        char[] arr = str.toCharArray();
        return arr.length;
    }

    static int getVowelsCount(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String str = "Love";

        System.out.println("Vowels Count: " + getVowelsCount(str));
        System.out.println("Length: " + getLengthofString(str));
    }
}