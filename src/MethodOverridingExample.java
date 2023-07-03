
class Super{
    public void display(){
        System.out.println("Super Display");
    }
}

class subClass extends Super{
    public void display(){
        System.out.println("Sub class Display");
    }
}
public class MethodOverridingExample {
    public static void main(String[] args){
       Super s = new Super();
       s.display();

       subClass sub = new subClass();
       sub.display();
// Dynamic method dispatch, reference should be of the parent.
       Super newSuper = new subClass();
       newSuper.display(); // here is the call made by method not reference

    }

}
