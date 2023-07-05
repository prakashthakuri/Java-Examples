interface interfaceTest{
    void method1();
    void method2();
}
//By default method is public and classes are abstract classes.
class InterfaceTest2 implements interfaceTest {

    public void method1() {
        System.out.println("Method 1");
    }

    public void method2() {

    }


}

public class InterfacesExample {
    public static void main(String[] args){

        InterfaceTest2 iT2 = new InterfaceTest2();
        iT2.method2();


    }

}
