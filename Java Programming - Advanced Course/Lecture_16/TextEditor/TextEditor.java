import java.util.ArrayList;
import java.util.List;

public class TextEditor {

    private List<String> text;

    public TextEditor() {
        this.text = new ArrayList<>();
    }

    public void addLine(String line) {
        text.add(line);
    }

    public void removeLine(int index) {
        if (index >= 0 && index < text.size()) {
            text.remove(index);
        }
    }

    public void print() {
        System.out.println("Текущий текст: ");
        if (text.isEmpty()) {
            System.out.println("[Пусто]");
        } else {
            System.out.println(String.join("\n", text));
        }
        System.out.println("--------------------");
    }


    public TextEditorMemento save() {
        return new TextEditorMemento(new ArrayList<>(this.text));
    }

    public void restore(TextEditorMemento memento) {
        this.text = memento.getState();
    }

    public static class TextEditorMemento {
        private final List<String> state;

        private TextEditorMemento(List<String> state) {
            this.state = state;
        }

        private List<String> getState() {
            return state;
        }
    }
}
