package test;

/**
 * Created by CharlesYang on 2018/1/26.
 */
public class testArrayTransfor {

    public static void changeSign(int x ,int [] a){
        a[x] = 8;
    }
    public static void main(String[] args) {
        int[] b = {1,2,3};
        changeSign(2,b);
        for (int a : b){
            System.out.println(a);
        }
    }
}
