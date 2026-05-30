public class Cylinder extends SolidOfRevolution{

    private double height;

    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }

    @Override
    public double getVolume(){
        double r = getRadius();
        return (r * r) * Math.PI * height;
    }

    public String toString(){
        return getClass().getSimpleName()  + " Радиус = " + getRadius() + ", Высота = " + height + ", Объем = " + getVolume();}

}
