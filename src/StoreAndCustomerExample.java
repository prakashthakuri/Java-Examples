interface Member{
    void callback();
}
class Store implements Member{
    Member members[] = new Member[100];
    int count = 0;

    void register(Member m){
        members[count++] = m;
    }
    void inviteSale(){
        for(int i=0; i < count; i++){
            members[i].callback();
            System.out.println("            members[i].callback();");
        }
    }

    @Override
    public void callback() {
        System.out.println("Call back");
    }
}

class employee implements Member{
    String name;
    employee(String n){
        name = n;
    }
    public void callback(){
        System.out.println("Call is clicked again"+ name);
    }

}

public class StoreAndCustomerExample {

    public static void main(String[] args) {
        Store s = new Store();
        employee c1 = new employee("John");
        employee c2 = new employee("Mary");
        s.register(c1);
        s.register(c2);
        s.inviteSale();
    }




}
