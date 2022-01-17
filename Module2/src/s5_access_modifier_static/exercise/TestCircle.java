package s5_access_modifier_static.exercise;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(4.5);
        System.out.println("Area of circle : "+circle.getArea());
        System.out.println("the radius of circle : "+circle.getRadius());
    }
}
