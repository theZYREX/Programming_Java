import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        Sentence sentence = new Sentence("Это простое предложение для теста.");

        System.out.println("Перебор слов через итератор:");

        Iterator<String> iterator = sentence.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            System.out.println(word);
        }
    }
}
