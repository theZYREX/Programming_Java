import java.util.ArrayList;
import java.util.Collections;

public class FractionApplication {

    public static void main(String[] args){

        ArrayList<Fraction> list = new ArrayList<>();
        list.add(new Fraction(1, 2));
        list.add(new Fraction(-3, 4));
        list.add(new Fraction(5, 8));
        list.add(new Fraction(3, 2));

        System.out.println("Исходный список: " + list);

        Collections.sort(list, new FractionComparator(FractionComparator.SortMode.ASCENDING));
        System.out.println("По возрастанию: " + list);

        Collections.sort(list, new FractionComparator(FractionComparator.SortMode.DESCENDING));
        System.out.println("По убыванию: " + list);

        Collections.sort(list, new FractionComparator(FractionComparator.SortMode.ABS_ASCENDING));
        System.out.println("По возрастанию модуля: " + list);

        Collections.sort(list, new FractionComparator(FractionComparator.SortMode.ABS_DESCENDING));
        System.out.println("По убыванию модуля: " + list);

    }
}
