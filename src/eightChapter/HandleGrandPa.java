package eightChapter;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;

import static java.lang.invoke.MethodHandles.lookup;

/**
 * Created by CharlesYang on 2018/5/23.
 */
public class HandleGrandPa {

    class GrandFather{
        void thinking(){
            System.out.println("i am grandfather");

        }
    }

    class Father extends GrandFather{
        @Override
        void thinking() {
            System.out.println("i am ddd father");
        }
    }

    class Son extends Father{
        @Override
        void thinking() {
            MethodType mt = MethodType.methodType(void.class);
            try {
                MethodHandle mh = lookup().findSpecial(GrandFather.class, "thinking", mt, getClass());
                mh.invoke(this);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        (new HandleGrandPa().new Son()).thinking();
    }
}
