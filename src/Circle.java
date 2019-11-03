public class Circle extends Shape implements Comparator{
    private double radius = 1.0;
    private String name = "hình tròn 1";

    public Circle(){

    }
    public  Circle( double radius){
        this.radius = radius;
    }
    public Circle( String name, double radius, String color) {
        this.name = name;
        this. radius = radius;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return radius*radius+Math.PI;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPerimeter(){
        return radius*2*Math.PI;
    }

    @Override
    public String toString(){
        return " the radius is: " + getRadius()
                + "the color is: " + getColor()
                + "the Area is : " + getArea();
    }

    @Override
    public String Compare(Shape a, Shape b) {
        if (a.getArea() > b.getArea()) {
            return a.getName() + " bigger than " +  b.getName();
        } else if (a.getArea() < b.getArea()) {
            return a.getName() + " smaller than "  + b.getName();
        } else {
            return a.getName() + " equal "  + b.getName();
        }
    }
}
