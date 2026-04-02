import java.util.Arrays;

public class GenericStack<E> {

    private E[] list;

    private int size = 0;

    public GenericStack() {
        list = (E[]) new Object[10];
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E peek() {
        return list[size - 1];
    }

    public void push(E o) {

        if(size == list.length){
            E[] newList = (E[]) new Object[list.length * 2];

            for(int i = 0;i < size; i++){
                newList[i] = list[i];
            }

            list = newList;
        }

        list[size] = o;

        size +=1;

    }

    public E pop() {
        E o = peek();

        list[size -1] = null;

        size -= 1;

        return o;
    }

    @Override
    public String toString() {
        return "стек: " + Arrays.toString(list);
    }
}
