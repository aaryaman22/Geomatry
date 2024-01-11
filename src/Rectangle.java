public class Rectangle extends Shape
{
    int a,b;
    @Override
    public void area() {
        System.out.println("area of rectangle is " + a*b);
    }
    @Override
    public void parameter() {
        int peri =a+b;
        System.out.println("perimeter of rectangle is " + peri);
    }
    public int[] retrive() {
        return new int[]{a, b};
    }
    Rectangle(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
}