class Product {
    private int itemNo;
    private String name;
    private double price;
    private int qty;

//    Constructor

    public Product(int itemNo){
        itemNo = itemNo;
    }
    public Product(int itemNo, String name){
        itemNo= itemNo;
        this.name = name;
    }
    public void setItemNo(int i){
        itemNo = i;
    }
    public void setName(String n) {
        name = n;
    }
    public void setPrice(double p){
        price = p;
    }
    public void setQty(int q) {
        qty = q;
    }

    public int getItemNo() {
        return itemNo;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getQty(){
        return qty;
    }

}

class Customer{
    private int customerId;
    private String name;
    private String address;
    private int phone;

}


public class ProductAndCustomer {
}
