import java.io.*;

class Employee {
    int salary = 60000;
}

class Engineer extends Employee {
    int benefits = 10000;

    public static void main(String[] args) {
        Engineer eng = new Engineer();
        int total = eng.salary + eng.benefits;
        System.out.println("Total Salary:" + total);
    }
}
