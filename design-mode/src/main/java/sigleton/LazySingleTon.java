package sigleton;

/**
 * @Author: ganbo
 * @Date: 2019/10/30 12:53
 */
public class LazySingleTon {

    private static LazySingleTon instance;

    private LazySingleTon() {
    }

    public static LazySingleTon getInstance() {
        if (instance == null) {
            instance = new LazySingleTon();
        }
        return instance;
    }


    public static void main(String[] args) {

    }
}
