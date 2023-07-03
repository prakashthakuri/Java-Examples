abstract class SuperAbstract {
    public void nonAbstractMethod() {
        System.out.println("Non Abstract Class");
    }

     abstract public void abstractMethod();
}
class subAbstract extends SuperAbstract {
    public void abstractMethod(){
        System.out.println("Overriding Abstract method with concrete method");
    }
}

public class AbstractClassExample {
    public static void main(String[] args){
//        Abstract class cannot initiated the Object but can only pass the references
//        SuperAbstract sa = new SuperAbstract();

        SuperAbstract sa = new subAbstract();
        sa.nonAbstractMethod();
        sa.abstractMethod();

    }
}
