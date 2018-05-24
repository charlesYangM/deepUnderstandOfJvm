package classloading;

/**
 * Created by CharlesYang on 2018/1/25.
 */
public class ClinintStatic {
    static class Parent{
        public static int A =1;
        static {
            A =2;

        }

    }
    static class  Sub extends Parent{
        public static int B =A;
    }

    public static void main(String[] args) {
        System.out.println(Sub.B);
    }
}
