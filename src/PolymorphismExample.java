class Shapes {
    void draw() {
        System.out.println("Drawing a shape.");
    }
}

class Circles extends Shapes {
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Rectangles extends Shapes {
    void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Shapes shape1 = new Circles();
        Shapes shape2 = new Rectangles();

        shape1.draw();  // Calls draw() from Circle
        shape2.draw();  // Calls draw() from Rectangle
    }
}

