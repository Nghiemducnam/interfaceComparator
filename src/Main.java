import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

public class Main {
    public static void main(String[] args) {
        Circle [] circles = new Circle[3];
        circles[0] = new Circle("circle a", 3.0,"blue");
        circles[1] = new Circle("circle b", 5.0, "green");
        circles[2] = new Circle("circle c", 7.0, "black");

        Circle circle = new Circle();
        String result = circle.Compare(circles[0], circles[1]);
        System.out.println(result);

        Square [] squares = new Square[3];
        squares[0] = new Square("Square1", "yellow", 7.0);
        squares[1] = new Square("square2", "green", 3.0);

        Square square = new Square();
        String result1 = square.Compare(squares[0], squares[1]);
        System.out.println(result1);
    }
}
