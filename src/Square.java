public class Square extends Shape implements Comparator {
    public double length = 4.0;
    private String name;

    public Square() {
    }

    @Override
    public String getName() {
        return this.name;
    }

    public Square(String name, String color, double length){
        this.name = name;
        this.color = color;
        this.length =length;
    }

    @Override
    public double getArea() {
        return this.length*4;
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
