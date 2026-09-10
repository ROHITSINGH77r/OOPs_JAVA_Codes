abstract class Vehicle {
    abstract void start();

    void stop() {
        System.out.println("Vehicle stopped");
    }

    void breakdown() {
        System.out.println("Vehicle broke down");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car start with key");
    }

    public static void main(String[] args) {

        Vehicle v = new Car();

        v.start();
        v.stop();
        v.breakdown();
    }
}
