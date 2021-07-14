public class Circle {
    private double radius;

    public Circle() {
        this.radius = 1;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return (Math.PI * Math.pow(radius, 2));
    }

    public double getCircum() {
        return (2 * Math.PI * this.radius);
    }

    public double getRadius() {
        return this.radius;
    }
}
