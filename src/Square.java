public class  Square extends Shape {
    int a, b;

    @Override
    public void area() {
        System.out.println("area of square is " + a * b);
    }

    @Override
    public void parameter() {
        int peri = a + b;
        System.out.println("perimeter of square is " + peri);
    }

    @Override
    public int[] retrive() {
        return new int[]{a, b};
    }

    Square(int a, int b) {
        this.a = a;
        this.b = b;
    }
}