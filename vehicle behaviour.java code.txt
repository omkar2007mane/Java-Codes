import java.util.Scanner;
class Vehicle{
    void start(){
        System.out.println("Vehicle Behaviour");
    }
}
class Car extends Vehicle{
    void start(){
        System.out.println("Starting behaviour of Car");
    }
}
class Bike extends Vehicle{
    void start(){
        System.out.println("Starting behaviour of Bike");
    }
}
public class Main{
    public static void main(String[]args){
        Vehicle v=new Vehicle();
        Car c=new Car();
        Bike b=new Bike();
        v.start();
        System.out.println("Choose Vehicle");
        System.out.println("1-Car");
        System.out.println("2-Bike");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        if (choice==1){
            c.start();
        }
        else if (choice==2){
            b.start();
        }
        else{
            System.out.println("Invalid choice");
        }
    }
}
