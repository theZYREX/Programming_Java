import java.util.Comparator;

public class FractionComparator implements Comparator<Fraction> {

    public enum SortMode {
        ASCENDING,
        DESCENDING,
        ABS_ASCENDING,
        ABS_DESCENDING
    }

    public SortMode mode;

    public FractionComparator(SortMode mode) {
        this.mode = mode;
    }

    @Override
    public int compare(Fraction f1, Fraction f2) {
        switch (mode) {
            case ASCENDING:
                return f1.compareTo(f2);

            case DESCENDING:
                return f2.compareTo(f1);

            case ABS_ASCENDING:{

                int a = Math.abs(f1.numerator);
                int b = Math.abs(f1.denominator);

                int c = Math.abs(f2.numerator);
                int d = Math.abs(f2.denominator);

                int left = a * d;
                int right = b * c;

                int result = 0;

                if (left > right){result = 1;};
                if (left < right){result = -1;};

                return result;
            }

            case ABS_DESCENDING:{

                int a = Math.abs(f1.numerator);
                int b = Math.abs(f1.denominator);

                int c = Math.abs(f2.numerator);
                int d = Math.abs(f2.denominator);

                int left = a * d;
                int right = b * c;

                int result = 0;

                if (left < right){result = 1;};
                if (left > right){result = -1;};

                return result;
            }

            default:
                return 0;
        }
    }
}
