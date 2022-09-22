public class Age{
    public static void main(String[] args) throws Exception {
     
    final int myVar;
    myVar = 50;
    final int someVariable;
    int someOtherVariable = 100;
    someVariable = someOtherVariable;
    System.out.print(someVariable + "\t");
    System.out.println( myVar);
    
    if (someOtherVariable == 100){
        System.out.println("This value is equal to 100");
    } else {
        System.out.println("This value is not equal") ;
    }
    System.out.println( " These two variables multiplied together gives you: "+ someOtherVariable * myVar);
    System.out.println( " These two variables divided together gives you: "+ someOtherVariable / myVar);
    }
}
