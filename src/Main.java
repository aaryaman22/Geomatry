import java.util.Scanner;

abstract class Shape
{
    final double pi = 3.14;
    public abstract void area();
    public abstract void parameter();
    public abstract int[] retrive();
}
public class Main {
    public static void main(String[] args) {
        while(true)
        {
            System.out.println("enter the geomatry shape you want to know about");
            String geomatry;
            Scanner sc = new Scanner(System.in);
            geomatry = sc.nextLine();
            int len , breth;
            switch(geomatry)
            {
                case "circle":
                    System.out.println("enter the radius");

                    double radius = sc.nextInt();
                    Circle c = new Circle(radius);
                    c.area();
                    c.parameter();
                    c.retrive();
                    break;
                case "square":
                    System.out.println("enter the length");
                    len = sc.nextInt();
                    Square sq = new Square(len , len);
                    sq.area();
                    sq.parameter();
                    sq.retrive();
                    break;
                case "rectangle":
                    System.out.println("enter the length and breath");
                    len = sc.nextInt();
                    breth = sc.nextInt();
                    Rectangle rec = new Rectangle(len , breth);
                    rec.area();
                    rec.parameter();
                    rec.retrive();
                    break;
                case "ellipse":
                    System.out.println("enter the major and minor");
                    double major = sc.nextInt();
                    double minor = sc.nextInt();
                    Ellipse elip = new Ellipse(major , minor);
                    elip.area();
                    elip.parameter();
                    elip.retrive();
                    break;
            }
        }
    }
}