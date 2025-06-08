package Interface;
/*                                      INTERFACES IN JAVA
====================================================================================================================
 In Java, an interface is a blueprint for classes, defining a contract that specifies methods a class must implement.
 It's a way to achieve abstraction and multiple inheritance, as a class can implement multiple interfaces.
 it is 100% abstraction (interface is used to achieve it)
 all the methods inside the interface will be by default (abstract and public)

*/

interface  Account
{
    void deposit();      //it is also abstract by default
    void withdraw();
    void checkbalance();
    void m1();

}
abstract class Sample implements Account{
    @Override
    public void checkbalance() {
        System.out.println("implemened");
    }

    @Override
    public void deposit() {
        System.out.println("done");
    }

    @Override
    public void withdraw() {
        System.out.println("ye v");
    }

    //Since this class is not implementing m1 method of interface so we had to make it abstract
    //so we made a subclass extending sample class whic had implememnted remaining methods of interfaces
}
class SubSample extends Sample{
    @Override
    public void m1() {
        System.out.println("Hello doston from m1");
    }
}

public class part1
{
    public static void main(String[] args)
    {
    Sample sam2= new SubSample();   //class level loose coupling not preferred in real
    Account sam= new SubSample();   //good loose coupling
    sam.m1();
    sam.checkbalance();
    sam2.deposit();
    sam2.withdraw();
    }
}