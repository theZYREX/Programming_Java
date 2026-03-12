public class Ball extends SolidOfRevolution {

    public Ball(double radius){
        super(radius);
    }

    @Override
    public double getVolume(){
        double r = getRadius();
        return (r * r * r) * Math.PI * (4.0/3.0);
    }

    public String toString(){
        return getClass().getSimpleName()  + " Радиус = " + getRadius() + ", Объем = " + getVolume();}

}
