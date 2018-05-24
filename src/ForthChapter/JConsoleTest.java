package ForthChapter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by CharlesYang on 2018/1/11.
 */
public class JConsoleTest {
    static class OOMObject{
        public byte[] placeholder = new byte[64*1024];

    }
    public static void fillHeap(int num)throws InterruptedException{
        List<OOMObject> list = new ArrayList<OOMObject>();
        for (int i = 0;i<num;i++){
            Thread.sleep(50);
            list.add(new OOMObject());
        }
        System.gc();
    }
    public static void main(String[] args) throws Exception{
        fillHeap(1000);
    }
}
