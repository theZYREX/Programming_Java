public class MyStackApplication {
    public static void main(String[] args){
        MyStack s = new MyStack();

        s.push(10);
        s.push(21);
        s.push(3);
        s.push(9);
        s.push(77);

        System.out.println(s);

        s.sort();

        System.out.println(s);

    }
}
