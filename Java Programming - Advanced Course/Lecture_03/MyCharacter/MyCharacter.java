public class MyCharacter implements Comparable<MyCharacter> {

    public char value;

    public MyCharacter(char value) {
        this.value = value;
    }

    public char charValue() {
        return this.value;
    }

    public int compareTo(MyCharacter anotherCharacter) {
        return this.value - anotherCharacter.value;
    }

    @Override
    public boolean equals(Object anotherCharacter) {
        if (this == anotherCharacter) return true;
        if (anotherCharacter == null || getClass() != anotherCharacter.getClass()) return false;
        MyCharacter that = (MyCharacter) anotherCharacter;
        return this.value == that.value;
    }

    public boolean isDigit() {
        return this.value >= '0' && this.value <= '9';
    }

    public static boolean isDigit(MyCharacter ch) {
        return ch.isDigit();
    }

    public static boolean isLetter(MyCharacter ch) {
        char c = ch.charValue();
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    public static boolean isLetterOrDigit(MyCharacter ch) {
        return isLetter(ch) || isDigit(ch);
    }
}
