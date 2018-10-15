package vn.codegym.QuyenLeSy;

public class Main {
    public static void main(String[] args) {

        Shape[] shape = new Shape[3];
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();

        shape[0] = circle;
        shape[1] = rectangle;
        shape[2] = square;

        for(Shape s: shape){
            System.out.println(s.toString());
        }

    }
}
