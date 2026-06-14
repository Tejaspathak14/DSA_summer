import java.sql.SQLOutput;

public class DataTypes {
    static void main(){

        //Numeric DT - short , long , byte , int

        byte num1 = 100;
        System.out.println(num1);

       // byte num2 = 500;  //not print because byte range will be from -128 to 127
       // System.out.println(num2);

        short num3 = 5000;
        System.out.println(num3);

        //short num4 = 50000; // range is higher than is limit
        //System.out.println(num4);

        long num5 = 3516549;
        System.out.println(num5);

        int num6 = 5;
        System.out.println(num6);

        //flaoting datatype

        float num7 = 3.147f;
        System.out.println(num7);

        double num8 = 3.1475544894;
        System.out.println(num8);

        boolean forvote = true;
        System.out.println(forvote);

        char firstCharacter = 'a';
        System.out.println("my first character is :" + (char)(firstCharacter+2));


    }
}
