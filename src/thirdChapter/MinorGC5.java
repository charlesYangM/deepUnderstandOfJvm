package thirdChapter;

/**
 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+UseSerialGC
 * -XX:MaxTenuringThreshold=1 -XX:+PrintTenuringDistribution
 *
 *
 * Created by CharlesYang on 2018/1/10.
 */
public class MinorGC5 {
    private static final int _1MB = 1024*1024;

    public static void main(String[] args) {
        byte[] allocation1, allocation2, allocation3, allocation4,
        allocation5, allocation6, allocation7;

        allocation1 = new byte[_1MB*2];
        allocation2 = new byte[_1MB*2];


        allocation3 = new byte[_1MB*2];
        allocation4 = new byte[_1MB*2];
        allocation5 = new byte[_1MB*2];
        allocation6 = new byte[_1MB*2];

        allocation4 = null;
        allocation5 = null;
        allocation6 = null;
        allocation7 = new byte[_1MB * 2];
    }
}
