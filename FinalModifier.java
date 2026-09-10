public class FinalModifier {
    
    final String name="SandeepBKL";
    void updateName(){
        System.out.println("Updated name:" + name);
    }

    public static void main(String[] args) {
        System.out.println("Final method called");
        FinalModifier obj = new FinalModifier();
        obj.updateName();
    }
}
