package Bank;

import javax.xml.parsers.SAXParser;

public class Bank {
    public static void main (String agr[]){
        Bank1 hdfc=new Hdfc();
        hdfc.calculateInterest();
        hdfc.diposite();
        hdfc.withdraw();
       Bank1 icici= new Icici();
       icici.calculateInterest();
       icici.withdraw();
       icici.diposite();


    }


}
abstract class Bank1{
    public void diposite(){
        System.out.println("Common deposite method implementation across all banks");

    }
    public void withdraw(){
        System.out.println("common withdraw method implementation across all bank");
    }
    public abstract int calculateInterest();

}
class Hdfc extends Bank1{
    public int calculateInterest(){
        System.out.println("Hdfc bank calculate interest implement");
        return 0;
    }

        }
 class Icici extends Bank1{
    public int calculateInterest(){
        System.out.println("icici bank calculate interest implement");
        return 0;
    }
 }