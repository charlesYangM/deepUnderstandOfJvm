package eightChapter;

/**
 * Created by CharlesYang on 2018/1/29.
 */
public class ReuseSlot {
    public static void main(String[] args) {
        {
            byte[] placeholder = new byte[64*1024*1024];
        }
        int a =0;
        System.gc();
    }
}
