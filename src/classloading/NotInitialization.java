package classloading;

/**
 * Created by CharlesYang on 2018/1/23.
 */
public class NotInitialization {
    public static void main(String[] args) {
        System.out.println(ConstClass.HELLOWORLD);
    }
}
