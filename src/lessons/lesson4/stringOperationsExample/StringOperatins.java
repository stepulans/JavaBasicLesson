package lessons.lesson4.stringOperationsExample;

public class StringOperatins {
    public static void main(String[] args) {

        String text = " Это текст для проверки работы методов типа String. ";

        String text2 =" ";

        String str1 = "java";
        String str2 = new String("java");

        System.out.println(text.length());
        System.out.println(text2.length());

        System.out.println(text.isEmpty());
        System.out.println(text2.isEmpty());

        System.out.println(text.isBlank());
        System.out.println(text2.isBlank());

        char simbol1 = text.charAt(2);

        System.out.println(simbol1);

        System.out.println(text.charAt(3));
        System.out.println(text.charAt(10));
        System.out.println(text.charAt(14));
        System.out.println(text.charAt(48));

        System.out.println(text.substring(45));

        String subText = text.substring(0,11);
        System.out.println(subText + " " + subText.length());


        System.out.println(text.charAt(48));
        //System.out.println(text.charAt(49));
        String subText2 = text.substring(0,49);
        System.out.println(subText2 + " " + subText2.length());


        String text33 = "Это текст для проверки работы методов типа String. Это текст для проверки работы методов типа String. Это текст для проверки работы методов типа String!";

        System.out.println(text33.length());
        System.out.println(text33.charAt(text33.length()-1));

    }
}
