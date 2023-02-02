package Lessons.Lesson4.stringOperationsExample;

public class WorkWithStrings2 {
    public static void main(String[] args) {

        String text = " Teksts String tipa darba parbaude ";

        System.out.println("Our working text is - " + text);

        String testString1 = "darba";

        text = text.toLowerCase();
// maina uy mayajiem burtiem
        System.out.println(text);

        boolean resultContains = text.contains(testString1);

        System.out.println("String " +testString1 + " contains? - " + resultContains);

        String textAfterTrim = text.trim();
// abgriezh space bar
        System.out.println(textAfterTrim);

        String oldString = "In java, Olga the best, super java programmer!";
        String newString = oldString.replace('j' ,'*' );
        System.out.println(newString);
// maina burtu j uz *
        newString = oldString.replace("Olga", "@All group 240123");
        System.out.println(newString);
// maina Olga uz @All group 240123
        System.out.println(newString.indexOf("@"));
// nosaka indeksu @


    }

}
