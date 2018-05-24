package classloading;

/**
 * Created by CharlesYang on 2018/1/23.
 */
public class ConstClass {
    static{
        System.out.println("ConstClass init1");

    }
    public static final String HELLOWORLD = "hellow world";
}
