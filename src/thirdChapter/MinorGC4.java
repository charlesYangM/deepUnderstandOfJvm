package thirdChapter;

/**
 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+UseSerialGC
 * -XX:MaxTenuringThreshold=1 -XX:+PrintTenuringDistribution
 *
 * 用来测试动态对象年龄判定，
 * Created by CharlesYang on 2018/1/10.
 */
public class MinorGC4 {
    private static final int _1MB = 1024*1024;

    public static void main(String[] args) {
        byte[] allocation1, allocation2, allocation3, allocation4;

        allocation1 = new byte[_1MB/4];
        allocation2 = new byte[_1MB/4];


        allocation3 = new byte[_1MB*4];
        allocation4 = new byte[_1MB*4];
        allocation4 = null;
        allocation4 = new byte[_1MB*4];
    }
}
