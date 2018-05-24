package thirdChapter;

/**
 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+UseSerialGC
 * Created by CharlesYang on 2018/1/10.
 */
public class MinorGC2 {
    private static final int _1MB = 1024*1024;

    public static void main(String[] args) {
        byte[] allocation1;

        allocation1 = new byte[4*_1MB];
    }
}
