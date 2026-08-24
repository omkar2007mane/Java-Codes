class Area{
    void calculateArea(int a)
    {
       int area=a*a;
       System.out.println("Area of Square is:"+area);
    }
    void calculateArea(int l,int b)
    {
       int area=l*b;
       System.out.println("Area of Rectangle is:"+area);
    }
    void calculateArea(double r)
    {
       double area= Math.PI*r*r;
       System.out.println("Area of Circle is:"+area);
    }
}
public class Main{
    public static void main(String[]args){
        Area obj = new Area();
        obj.calculateArea(2);
        obj.calculateArea(2,3);
        obj.calculateArea(2.1);
    }
}