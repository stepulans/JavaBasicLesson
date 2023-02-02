package Lessons.Lesson4.stringOperationsExample;

public class StringOperatins {
    public static void main(String[] args) {

        String text = " Teksts, String tipa darba parbaude ";

        String text2 =" ";

        String str1 = "java";
        String str2 = new String("java");

        System.out.println(text.length());
        System.out.println(text2.length());

        System.out.println(text.isEmpty());
        System.out.println(text2.isEmpty());

        System.out.println(text.isBlank());
        System.out.println(text2.isBlank());

    }
}
