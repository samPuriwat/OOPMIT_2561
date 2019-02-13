package lab8;

public class GraphicObjectApp {

    public static void main(String[] args) {

        Rectangle rec = new Rectangle("Red",
                20.0, 5.0);

        System.out.println(rec.toString());
        rec.findArea();
        rec.draw();

        Circle myCir = new Circle("Blue", 5.0);
        myCir.draw();
        myCir.findArea();
        myCir.toString();


    }
}
