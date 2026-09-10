public class ClassConstructor {  
    // Instance variables
    String name; 
    int rollno;  

    // Parameterized constructor
    ClassConstructor(String n, int r) {     
        this.name = n;     
        this.rollno = r; 
    } 

    // Instance method (Note the uppercase 'D')
    public void Display() {     
        System.out.println("Name: " + name +  " , Rollno: " + rollno); 
    }     

    public static void main(String[] args) { 
        ClassConstructor obj = new ClassConstructor("Ajay", 155);               
        obj.Display();     
    }  
}
