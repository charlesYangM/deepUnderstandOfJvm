package sevenChapter;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

/**
 * Created by CharlesYang on 2018/5/22.
 */
public class String {
    static {
        if (true){
            System.out.println(Thread.currentThread() + "init DeadLoopClass");
            while (true){

            }
        }

    }

    public static void main(String[] args) {
        Runnable script = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread() + "Start");
                String dlc = new String();
                System.out.println(Thread.currentThread() + "run over");
            }
        };

        Thread thread1 = new Thread(script);
        Thread thread2 = new Thread(script);
        thread1.start();
        thread2.start();
    }
}
