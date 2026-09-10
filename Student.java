class Student {

    public void printStudent(String studentClass) {
        System.out.println("Student class: " + studentClass);
    }

    public void printStudent(String name, int age) {
        System.out.println("Student name: " + name);
        System.out.println("Student age: " + age);
    }

    public static void main(String[] args) {
        Student obj = new Student();

        obj.printStudent("AI-Z");
        obj.printStudent("abcd", 200);
    }
}