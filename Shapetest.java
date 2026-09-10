class Shape{
    void area(){
    System.out.println("area of circle");
    }
}
class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    @Override
    void area(){
        double circle Result=3.14*radius*radius;
    }
}
public class Shapetest{
    public static void main(String[]args){
        Shapetest s=new Circle(5);
        Shapetest s1=new Rectangle(10,5);
        s.area();
        s1.area();
        System.out.println();
    }
}