package diqiuzhuanzhuan;
import com.spotify.annoy.jni.base.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */


public class App
{


    public static void main( String[] args )
    {
        Annoy.Builder a = Annoy.newIndex(5, Annoy.Metric.ANGULAR);
        ArrayList<Float> b = new ArrayList<Float>();
        for (int i = 0; i < 5; i++ ) {
            b.add((float)1.4);
        }
        a.addItem(1, b);
        AnnoyIndex c = a.build(1);

        System.out.println(c.getItemVector(1));

        System.out.println(System.getProperty("java.library.path") );

    }
}
