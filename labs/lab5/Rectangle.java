public class Rectangle {
    private int width;
    private int height;

    Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    public Rectangle(int width, int height) {
        this.height = height;
        this.width = width;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public int getArea() {
        return this.width * this.height;
    }

    public int getPerimeter() {
        return 2 * (this.width + this.height);
    }
}