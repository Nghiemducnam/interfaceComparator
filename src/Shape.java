
public abstract class Shape {
    public String color = "red";
    public  String name = "shape1";

    public Shape() {

    }
    public Shape(String color, boolean filled){

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public abstract String getName();
    public abstract double getArea();

    public String toString(){
        return "A Shape with color of "+getColor();
    }
}
