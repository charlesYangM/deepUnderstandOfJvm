package secondChapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CharlesYang on 2018/1/8.
 */
public class HeapOOM {
    static class OOMObject{}

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();
        while (true){
            list.add(new OOMObject());
        }
    }
}
