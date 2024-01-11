public class  Circle extends Shape
{
    double r;
    @Override
    public void area() {
        double areaCircle = pi*r*r;
        System.out.println("area of square is " + areaCircle);
    }
    @Override
    public void parameter() {
        double peri =2*pi*r;
        System.out.println("perimeter of square is " + 2*pi*r);
    }

    @Override
    public int[] retrive() {
        return new int[]{(int)r};// not to be
    }
    Circle(double a)
    {
        this.r = a;
    }
}