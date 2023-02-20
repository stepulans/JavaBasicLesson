package lessons.summarrySession;

public class Massivi2 {
    public class Array1Class {
    public static void main(String[] args) {
        String[] engWords = {"Hi", "Hello", "World"};
        String[] rusWords = {"Хай", "Привет", "Мир"};

        for (int i = 0; i < engWords.length; i++) {
            String engWord = engWords[i];
            String rusWord = rusWords[i];
            System.out.println(engWord + " = " + rusWord);
        }
    }
}
}
