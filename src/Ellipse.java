public class  Ellipse extends Shape
{
    double major , minor;
    @Override
    public void area() {
        System.out.println("area of ellipse is " + pi*major*minor);
    }
    @Override
    public void parameter() {
        double peri = 2*pi*(Math.sqrt((minor*minor + major*major)/2));
        System.out.println("perimeter of ellipse is " + peri);
    }
    public int[] retrive() {
        return new int[]{(int)major, (int)minor};
    }
    public Ellipse(double a,double b)
    {
        this.major = a;
        this.minor = b;
    }
}