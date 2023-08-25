package umm2101;

/**
 * Hello world!
 *
 */
public class App 
{

    public int squareANumber(int numberToSquare) {
        return numberToSquare * numberToSquare;
    }
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        App myInstance = new App();
        int num = 23;
        System.out.println("The square of " + num + " is: " + myInstance.squareANumber(num));
    }
}
