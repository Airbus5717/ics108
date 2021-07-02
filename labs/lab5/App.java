// OO programming

public class App {
    public static void main(String[] args) throws Exception {
        Rectangle rect1 = new Rectangle(4, 10);
        Rectangle rect2 = new Rectangle(5, 9);

        System.out.println("rect1 width: " + rect1.getWidth());
        System.out.println("rect1 height: " + rect1.getHeight());
        System.out.println("rect1 area: " + rect1.getArea());
        System.out.println("rect1 perimeter: " + rect2.getPerimeter());

        System.out.println("-----------------------------------");

        System.out.println("rect2 width: " + rect2.getWidth());
        System.out.println("rect2 height: " + rect2.getHeight());
        System.out.println("rect2 area: " + rect2.getArea());
        System.out.println("rect2 perimeter: " + rect2.getPerimeter());
    }

}
