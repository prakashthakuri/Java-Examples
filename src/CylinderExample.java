class Cylinder {

    private double radius;
    private double height;

    public void setRadius(double r){
        radius= r;
    }
    public void setHeight(double h){
        height = h;
    }

    public double getHeight(){
        return height;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
       return getRadius()*getRadius()*getHeight();
    }

}

public class CylinderExample {
    public static void main(String[] args){
        Cylinder c = new Cylinder();
        c.setHeight(10);
        c.setRadius(1);

        System.out.println(c.getArea()+ "Area");

    }
}
