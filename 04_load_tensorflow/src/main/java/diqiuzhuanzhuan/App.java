package diqiuzhuanzhuan;

import java.io.File;

import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import org.apache.commons.io.IOUtils;
import org.tensorflow.Graph;
import org.tensorflow.SavedModelBundle;
import org.tensorflow.Session;
import org.tensorflow.Tensor;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App
{
    public App()
    {
        getResources();

    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        try {
            new App().loadModel();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }

    public File getResources()
    {
        System.out.println("getResources");
        File file = new File(getClass().getClassLoader().getResource("model/1").getFile());
        return file;
    }

    public void loadModel() throws IOException
    {
        String file = this.getResources().toString();
        SavedModelBundle bundle = SavedModelBundle.load(file, "serve");
        float[][] matrix = new float[1][784];
        Arrays.fill(matrix[0], 0.85f);
        Tensor t = Tensor.create(matrix);
        System.out.println(t);
        Tensor<Float> res = bundle.session().runner().feed("x", t).fetch("y").run().get(0).expect(Float.class);
        int maxObjects = (int) res.shape()[1];
        float[] y = res.copyTo(new float[1][maxObjects])[0];
        System.out.println(y[0]);
    }


}
