package diqiuzhuanzhuan;


import java.util.HashMap;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main(String[] args )
    {

        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("三", 3);
        System.out.println(hashMap.containsKey("三"));
        System.out.println( "Hello World!" );
    }

}
