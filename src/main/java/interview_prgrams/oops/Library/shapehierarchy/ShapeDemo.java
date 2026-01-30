package interview_prgrams.oops.Library.shapehierarchy;

import java.util.ArrayList;
import java.util.List;

public class ShapeDemo {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Rectangle(4, 6));

        for (Shape s : shapes) {
            s.display(); // Polymorphic call
        }
    }
}
