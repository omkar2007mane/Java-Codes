import java.util.Scanner;
class Payment{
    void payment(){
        System.out.println("Payment in progress");
    }
}
class UPI extends Payment{
    void payment(){
        System.out.println("UPI Transaction");
    }
}
class Card extends Payment{
    void payment(){
     System.out.println("Card Transaction");   
    }
}
class Cash extends Payment{
    void payment(){
     System.out.println("Cash Transaction");   
    }
}
public class Main{
    public static void main(String[]args){
        Payment pay=new Payment();
        UPI upi=new UPI();
        Card card=new Card();
        Cash cash =new Cash();
        pay.payment();
        System.out.println("Choose payment method");
        System.out.println("1-UPI");
        System.out.println("2-Card");
        System.out.println("3-Cash");
        System.out.println("Enter your choice");
        Scanner sc = new Scanner(System.in);
        int choice=sc.nextInt();
        if(choice==1){
            upi.payment();
        }
        else if (choice==2){
            card.payment();
        }
        else if ( choice==3){
            card.payment();
        }
        else{
            System.out.println("Invalid choice");
        }
        
        
    }
}