public class ShapeApplication {
    public static void main(String[] args){
        Cylinder c1 = new Cylinder(2, 3);
        Ball b1 = new Ball(2);
        Pyramid p1 = new Pyramid(10, 4);

        System.out.println(c1);
        System.out.println(b1);
        System.out.println(p1);


        Box box = new Box(100);

        System.out.println(box);

        box.add(c1);
        box.add(p1);
        box.add(b1);

        System.out.println(box);

        Ball b2 = new Ball(100);
        System.out.println("Новый шар: " + b2);

        System.out.println(box.add(b2));

    }
}
