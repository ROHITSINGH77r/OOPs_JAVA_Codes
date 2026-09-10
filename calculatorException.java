public class calculatorException {
    int a, b;

    public calculatorException(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int add() {
        return a + b;
    }

    int multip() {
        return a * b;
    }

    public static void main(String[] args) {
        calculatorException c = new calculatorException(5, 4);

        System.out.println("Addition: " + c.add());
        System.out.println("Multiplication: " + c.multip());
    }
}