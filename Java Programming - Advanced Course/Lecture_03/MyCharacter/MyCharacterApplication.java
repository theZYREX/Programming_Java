public class MyCharacterApplication {
    public static void main(String[] args) {

        MyCharacter charA = new MyCharacter('A');
        MyCharacter char5 = new MyCharacter('5');
        MyCharacter charB = new MyCharacter('B');

        System.out.println("Значение char5: " + char5.charValue());

        System.out.println("charA равно charB? " + charA.equals(charB));
        System.out.println("Сравнение A и B: " + charA.compareTo(charB));

        System.out.println("char5 это цифра? " + char5.isDigit());
        System.out.println("charA это цифра? " + MyCharacter.isDigit(charA));

        System.out.println("charA это буква? " + MyCharacter.isLetter(charA));
        System.out.println("char5 это буква или цифра? " + MyCharacter.isLetterOrDigit(char5));
    }
}
