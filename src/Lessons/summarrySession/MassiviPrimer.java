package lessons.summarrySession;

public class MassiviPrimer {
    public static void main(String[] args) {

        String[] values = {"Lidl", "aldi", "kaufland"};
// 1. for-each loop
        for (String value : values) {
            System.out.println(value);
        }

// 2. for loop
        for (int i = 0; i < values.length; i++) {
            String value = values[i];
            System.out.println(value);
        }

        // 3. while loop
        int i = 0;
        while (i < values.length) {
            String value = values[i];
            System.out.println(value);
            i++;
        }

    }
}
