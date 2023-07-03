class Rectangle2 {
    private double length;
    private  double breadth;
//    getter and setter method
    public double getLength(){
        return length;
    }
    public double getBreadth(){
        return breadth;
    }
    public void setLength(double l){
        length = l;
    }

    public void setBreadth(double b){
        breadth = b;
    }




}

public class DataHiding {
    public static  void main (String[] args){
        Rectangle2 r = new Rectangle2();
        r.setLength(10);
        r.setBreadth(12);

        System.out.println(r.getLength() + r.getBreadth());

    }
}
