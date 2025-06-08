package Interface;

/*                         || Multiple Inheritance via Interace ||
                      =================================================*/

interface IDemo2{
    void m3();
}
interface IDemo3{
    void m4();
}
interface IDemo4 extends IDemo2,IDemo3{
    void m5();
}
class hell implements IDemo3 ,IDemo2, IDemo4{

    @Override
    public void m5() {
        System.out.println("Hello from Idemo4");
    }

    @Override
    public void m3() {
        System.out.println("Hello from Idemo3");
    }

    @Override
    public void m4() {
        System.out.println("Hello from Idemo2");
    }
}

//================= Whenever we make a variable we must initialize it

interface IRemote{
    public static final int min_voulume=0;
     int max_vol=100;    // by default ,it will (public static  final)
   // int value;  //can see in this case initialization is manadatory
}
class LG implements IRemote{
    public void hello(){
        System.out.println(IRemote.max_vol);
    }
}


//=========================================
interface H1
{
    int x=20; //public static final

}
interface h2{
    int x=30;

}
class Z implements h2,H1{
    public void good(){
//        System.out.println(x);     //compile time error
        System.out.println(H1.x);   //print 20
        System.out.println(h2.x);    //print 30
    }
}

public class Part2{
    public static void main(String[] args) {
        IDemo4 id =new hell();
        id.m5();
        id.m3();
        id.m4();
        Z hh= new Z();  //good agr interface me hota tb refrence variable us type ka rkh skte the
        hh.good();
    }
}