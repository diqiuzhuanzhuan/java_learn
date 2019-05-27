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
        System.out.println( "sqrt of 100 is " + sqrt(100) );
        out_of_index();
    }

    public static double sqrt(double num) {
        return new Sqrt().value(num);
    }

    public static int out_of_index() {
        int[] numbers = {1, 2, 3, 4};
        try {
            System.out.println(numbers[8]);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("the third element is " + numbers[2]);
        }
        return 0;
    }
}
