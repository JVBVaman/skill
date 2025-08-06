package oops_skill;
class Circle1 {
    void Area(double radius) {
        double area = 3.14159 * radius * radius;
        System.out.println("Radius: " + radius);
        System.out.println("Area of the circle: " + area);
    }
}

public class AreaCircle2 {
    public static void main(String[] args) {
        Circle1 c = new Circle1();
        c.Area(2.5);
    }
}
