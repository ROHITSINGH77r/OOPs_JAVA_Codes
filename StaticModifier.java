public class StaticModifier {
    static int a = 10;
    int b = 20;
    static int c;

    static {

        c = a * 30;
        System.out.println("Static method Value of a: " + a);
    }

    public static void main(String[] args) {
        StaticModifier obj = new StaticModifier();

        System.out.println("Value of a:" + a);
        System.out.println("Value of b:" + obj.b);

        System.out.println("Result:" + c);
    }
}