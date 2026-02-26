public class MyTimeApplication{

    public static void main(String[] args){
        MyTime t1 = new MyTime();
        MyTime t2 = new MyTime(555550000);
        MyTime t3 = new MyTime(5, 23, 55);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}
