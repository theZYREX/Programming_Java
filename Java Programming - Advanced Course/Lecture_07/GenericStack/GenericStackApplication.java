public class GenericStackApplication {
    public static void main(String[] args) {

        GenericStack<String> stack = new GenericStack<>();

        System.out.println(stack);
        System.out.println("Размер стека : " + stack.getSize());

        for (int i = 1; i <= 12; i++) {
            stack.push("Элемент " + i);
        }

        System.out.println("\n" + stack);
        System.out.println("Размер стека : " + stack.getSize());


        System.out.println("\n" + stack.pop());
        System.out.println("Размер стека : " + stack.getSize());
        System.out.println("\n" + stack);
    }
}
