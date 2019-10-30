package sigleton;

/**
 * 恶汉式
 *
 * @Date: 2019/10/30 12:51
 */
public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {}


    public static HungrySingleton getInstance() {
        return instance;
    }
}
