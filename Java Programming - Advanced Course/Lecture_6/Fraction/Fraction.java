public class Fraction implements Comparable<Fraction> {

    public int numerator;
    public int denominator = 1;

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public int compareTo(Fraction other) {

        int a = this.numerator;
        int b = this.denominator;

        int c = other.numerator;
        int d = other.denominator;

        //a/b - c/d

        int left = a * d;
        int right = b * c;

        int result = 0;

        if (left>right){result = 1;};
        if (left < right){result = -1;};

        return result;
    }

    @Override
    public String toString() {return numerator + "/" + denominator;}

}
