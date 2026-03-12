import java.util.ArrayList;

public class MyStack {

    private ArrayList<Comparable> list = new ArrayList<>();

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public int getSize(){
        return list.size();
    }

    public Comparable peek(){
        return list.get(getSize() - 1);
    }

    public Comparable pop(){
        Comparable o = list.get(getSize() -1);
        list.remove(getSize() -1);
        return o;
    }

    public void push(Comparable o){
        list.add(o);
    }

    public String toString(){
        return "Стек: " + list.toString();
    }

    public void sort(){

        for (int i = 0; i < list.size(); i ++){

            for(int j = 0; j < list.size() - i -1; j++){

                Comparable current = list.get(j);
                Comparable next = list.get(j+1);

                if (current.compareTo(next) > 0){
                    list.set(j+1, current);
                    list.set(j, next);

                }

            }
        }
    }

}
