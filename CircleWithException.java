import java.util.Scanner;

public class CircleWithException {
    private float radius;

    public CircleWithException() {
    }

    public CircleWithException(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) throws IllegalArgumentException {
        if (radius < 0)
            throw new IllegalArgumentException();
        this.radius = radius;
    }

    public float getArea() throws Exception {
        if (radius * radius * Math.PI > 1000)
            throw new Exception();
        return (float) (radius * radius * Math.PI);
    }

    public float getDiameter() {
        return 2 * radius;
    }

    public static void main(String[] args) {
        CircleWithException c = new CircleWithException();
        System.out.print("input radius: ");
        Scanner i = new Scanner(System.in);
        float rad = i.nextFloat();
        try {
            c.setRadius(rad);
            System.out.println("area: " + c.getArea());
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e);
        } catch (Exception e) {
            System.out.println("Caught: " + e);
        }

        i.close();
    }
}
