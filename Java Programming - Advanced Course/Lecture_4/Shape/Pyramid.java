public class Pyramid extends  Shape{

    private double s;
    private double h;

    public Pyramid(double s, double h){
        this.s = s;
        this.h = h;
    }

    @Override
    public double getVolume(){
        return s * h * (1.0 / 3.0);
    }

    public String toString(){
        return getClass().getSimpleName()  + " Площадь основания = " + s + ", Высота = " + h + ", Объем = " + getVolume();}

}
