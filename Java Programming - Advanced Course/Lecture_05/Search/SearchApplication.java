import java.util.Arrays;

public class SearchApplication {
    public static void main(String[] args){

        Integer[] a = {0,5,10,-100,-1124,162,12};

        System.out.println(Arrays.toString(Search.maxAndmin(a)));

        Fraction f1 = new Fraction(1,2);
        Fraction f2 = new Fraction(3,2);
        Fraction f3 = new Fraction(7,10);
        Fraction f4 = new Fraction(8,11);
        Fraction f5 = new Fraction(23,100);

        Fraction[] c = {f1, f2, f3, f4, f5};

        System.out.println(Arrays.toString(Search.maxAndmin(c)));

        Integer[] b = {1};

        System.out.println(Arrays.toString(Search.maxAndmin(b)));

    }
}
