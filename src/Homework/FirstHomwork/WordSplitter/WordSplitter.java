package Homework.FirstHomwork.WordSplitter;

public class WordSplitter {
    public static void main(String[] args) {
        String string = new String();

        String word1 = "Zucker";
        System.out.println(word1);
        String word2 = "University";
        System.out.println(word2);

        int half = word1.length() / 2;
        int half2 = word2.length() / 2;
        String word3 = word1.substring(0, half) + word2.substring(half2);

        System.out.println("New word is: " + word3);
    }
}
