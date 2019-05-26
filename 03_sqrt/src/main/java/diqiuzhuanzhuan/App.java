package diqiuzhuanzhuan;
import org.apache.commons.math3.analysis.function.Sqrt;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "sqrt of 100 is " + sqrt(100));
    }

    public static double sqrt(double num) {
        return new Sqrt().value(num);
    }
}
