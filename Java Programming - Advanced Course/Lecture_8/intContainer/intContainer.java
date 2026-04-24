import java.util.Arrays;

public class intContainer {

    private int[] array;
    private int size = 0;

    public intContainer(int capacity) {
        array = new int[capacity];
    }

    public void push(int value) throws ContainerFullException {

        if(size == array.length){
            throw new ContainerFullException("Контейнер заполнен!");
        }

        array[size] = value;
        size +=1;

    }

    public int peek(){
        return array[size-1];
    }

    public int pop() throws ContainerEmptyException {

        if(size ==0){
            throw new ContainerEmptyException("Контейнер пуст!");
        }

        int e = peek();

        array[size-1] = 0;

        size-=1;

        return e;
    }

    public void sort() throws SortException {

        if (size == 0) {
            throw new SortException("Нельзя сортировать пустой контейнер!");
        }

        boolean allElementsAreEqual = true;
        for (int i = 1; i < size; i++) {
            if (array[i] != array[0]) {
                allElementsAreEqual = false;
                break;
            }
        }

        if (allElementsAreEqual) {
            throw new SortException("Все элементы в контейнере равны, сортировка не имеет смысла!");
        }

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size - i - 1; j++) {

                int current = array[j];
                int next = array[j + 1];

                if (current > next) {
                    array[j+1] = current;
                    array[j] = next;

                }
            }
        }
    }

    @Override
    public String toString() {
        return "Контейнер: " + Arrays.toString(array);
    }
}
