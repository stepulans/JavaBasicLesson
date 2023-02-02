package Lessons.Lesson4.stringOperationsExample;

public class WorkWithStrings {
    public static void main(String[] args) {

        String text = " Это текст для проверки работы методов типа String. ";

        System.out.println("Our working text is - " + text);

        String testString1 = "работ";

        boolean resultContains = text.contains(testString1);

        System.out.println("String " +testString1 + " contains? - " + resultContains);

        testString1 = "Pert";

        resultContains = text.contains(testString1);

        System.out.println("String " + testString1 + " contains? - " + resultContains);

        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());

        System.out.println(text);

    }

}
