import java.util.Iterator;
import java.util.NoSuchElementException;

public class Sentence implements Iterable<String> {

    public String[] words;

    public Sentence(String text) {
        this.words = text.trim().split("\\s+");
    }

    @Override
    public Iterator<String> iterator() {
        return new WordIterator();
    }

    private class WordIterator implements Iterator<String> {

        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < words.length;
        }

        @Override
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return words[currentIndex++];
        }
    }
}
