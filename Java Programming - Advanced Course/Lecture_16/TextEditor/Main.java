public class Main {
    public static void main(String[] args) {

        TextEditor.TextEditorMemento quickSave = null;
        TextEditor editor = new TextEditor();

        editor.print();
        System.out.println('\n');

        editor.addLine("Строка 1: Начало работы.");
        editor.addLine("Строка 2: Важная информация.");
        editor.print();
        System.out.println('\n');

        quickSave = editor.save();

        editor.addLine("Строка 3: Новые данные.");
        editor.removeLine(1);
        editor.addLine("Строка 4: Что-то еще...");

        editor.print();

        editor.restore(quickSave);

        System.out.println("\nТекст после восстановления:");
        editor.print();
    }
}
