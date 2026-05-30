import java.util.ArrayList;

public class Box extends Shape {

    public double maxVolume;
    public double currentVolume = 0;
    private ArrayList<Shape> shapes;

    public Box(double maxVolume){
        this.maxVolume = maxVolume;
        this.shapes = new ArrayList<>();
    }

    @Override
    public double getVolume(){
        return currentVolume;
    }

    public boolean add(Shape shape){
        double v = shape.getVolume();
        if (currentVolume + v <= maxVolume){
            shapes.add(shape);
            currentVolume += v;
            return true;
        }
        else return false;
    }

    public String toString(){
        return getClass().getSimpleName() + " Максимальный объем = " + maxVolume + ", Текущий объем = " + currentVolume;}

}
