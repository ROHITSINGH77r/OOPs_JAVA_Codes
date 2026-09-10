class studentarray {
    public int roll_no;
    public String name;
    studentarray(int roll_no,String name){
        this.roll_no=roll_no;
        this.name=name;
    }    
}
public class Student{
    public static void main(String[]args){
        studentarray[] arr;
        arr=new studentarray[3];
        arr[0]=new studentarray(1,"a");
        arr[1]=new studentarray(2,"b");
        arr[2]=new studentarray(3,"c");
        for(int i=0;i<arr.length;i++){
            System.out.println("element at " + i +": {" + arr[i].roll_no + " " + arr[i].name+"}");
        }
    }
}