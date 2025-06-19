package WrapperClass;


public class wrapper {
    public static void main(String[] args) {

        //Boolean

        Boolean b1=new Boolean(true);  //sout  true

        Boolean b2=new Boolean(false); //sout false

        //exception case of boolean  wrapper class
        Boolean b3=new Boolean(True);

        Boolean b4=new Boolean(False);
        Boolean b5=new Boolean(FALSE);

        Boolean b6=new Boolean(TRUE);

        //When boolean takes the String(input) in the argument then if we pass true,TRUE, True it will sout true  .
        //in all other cases oher than true it will give us  the false as output.  ex=

        Boolean b7=new Boolean("true");  //sout  true

        Boolean b8=new Boolean("false"); //sout false
        Boolean b9=new Boolean("True");  //true

        Boolean b10=new Boolean("False");  //false
        Boolean b11=new Boolean("FALSE"); //false
        Boolean b12 =new Boolean("Prashant");//false
        Boolean b13=new Boolean("TRUE"); //true
    }
}