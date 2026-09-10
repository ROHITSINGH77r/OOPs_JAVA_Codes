interface Employ{
    void Empinfo();
}
interface Empsalary{
    void SalaryInfo();
}

class InheritanceEx implements Employ,Empsalary{

    String name;
    int age;
    double salary;

InheritanceEx(String name,int age,double salary){
    this.name=name;
    this.age=age;
    this.salary=salary;
}
@Override
public void Empinfo(){
    System.out.println("Employee name:" + name);
    System.out.println("Employee age:" + age);
}
public void SalaryInfo(){
    System.out.println("Employee salary:" + salary);
}
public static void main(String[] args) {
    InheritanceEx obj=new InheritanceEx("abcd", 43, 213341.43);
    obj.Empinfo();
    obj.SalaryInfo();
}
}
