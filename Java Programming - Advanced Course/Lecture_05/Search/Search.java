public class Search {
    public static Comparable[] maxAndmin(Comparable[] array) {

        if (array.length < 2){
            throw new IllegalArgumentException("В исходном массиве меньше 2 элементов");
        }

        Comparable max = array[0];
        Comparable min = array[0];

        for(int i = 0; i < array.length; i++){
            if(array[i].compareTo(max) > 0){
                max = array[i];
            }
            if(array[i].compareTo(min) < 0){
                min = array[i];
            }
        }

        Comparable[] result = {max, min};

        return result;

    }
}
