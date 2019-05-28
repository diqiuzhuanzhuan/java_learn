package diqiuzhuanzhuan;

import java.io.File;

import org.tensorflow.SavedModelBundle;
import org.tensorflow.Tensor;
import java.io.IOException;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App
{
    private SavedModelBundle _bundle;
    public App()
    {
        try {
            loadModel();
        }
        catch (IOException e) {
            System.out.println("加载模型资源失败");
        }
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        App app = new App();
        float[][] matrix = new float[1][784];
        Arrays.fill(matrix[0], 0.8f);
        System.out.println(app.predict(matrix));
        app.predict();
    }

    public File getResources()
    {
        System.out.println("getResources");
        File file = new File(getClass().getClassLoader().getResource("model/1").getFile());
        return file;
    }

    public void loadModel() throws IOException {
        String file = this.getResources().toString();
        _bundle = SavedModelBundle.load(file, "serve");
    }

    public int predict(float[][] matrix)
    {
        assert matrix.length == 784 * 1;
        Tensor t = Tensor.create(matrix);
        Tensor<Float> res = _bundle.session().runner().feed("x", t).fetch("y").run().get(0).expect(Float.class);
        int maxObjects = (int) res.shape()[1];
        float[] y = res.copyTo(new float[1][maxObjects])[0];
        int maxIndex = argmax(y);
        return maxIndex;
    }

    protected static int argmax(float[] a) {
        float max = -1.0F / 0.0f;
        int argmax = 0;

        for(int i = 0; i < a.length; ++i) {
            if (a[i] > max) {
                max = a[i];
                argmax = i;
            }
        }

        return argmax;
    }

    public void predict()
    {

        float[][] matrix = new float[1][784];
        Arrays.fill(matrix[0], 0.85f);
        Tensor t = Tensor.create(matrix);
        System.out.println(t);
        Tensor<Float> res = _bundle.session().runner().feed("x", t).fetch("y").run().get(0).expect(Float.class);
        int maxObjects = (int) res.shape()[1];
        float[] y = res.copyTo(new float[1][maxObjects])[0];
        float sum = 0;
        for (int i = 0; i < y.length; i++){
            System.out.println(y[i]);
            sum += y[i];
        }
        System.out.println("the sum is " + sum);
    }

}
