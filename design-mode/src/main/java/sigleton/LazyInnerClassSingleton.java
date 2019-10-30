package sigleton;

/**
 * 内部类单利模式
 *
 * @Date: 2019/10/30 13:39
 */
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton() {}

    public static final LazyInnerClassSingleton getInstance() {
        return LazyHolder.LAZY;
    }

    private static class LazyHolder {
        private static final LazyInnerClassSingleton LAZY =
                new LazyInnerClassSingleton();
    }

    public static void main(String[] args) {

    }

}
