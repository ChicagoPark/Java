package Abstract;

import Abstract.GraphicObject;

public class Rectangle extends GraphicObject {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
    @Override
    void resize() {
        System.out.println("Resizing a Rectangle");
    }
}
