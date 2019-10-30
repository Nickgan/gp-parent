package sigleton;

/**
 * @Author: ganbo
 * @Date: 2019/10/30 12:55
 */
public class LazySingletonThreadTest implements Runnable {

    public void run() {
        LazySingleTon instance = LazySingleTon.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + instance);
    }
}
