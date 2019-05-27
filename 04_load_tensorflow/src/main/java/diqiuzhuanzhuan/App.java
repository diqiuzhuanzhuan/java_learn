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

/**
 * Hello world!
 *
 */
public class App 
{
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
        File file = new File(getClass().getClassLoader().getResource("model/1").getFile());
        return file;
    }

    public void loadModel() throws IOException
    {
        String file = this.getResources().toString();
        SavedModelBundle bundle = SavedModelBundle.load(file, "serve");
    }


}
