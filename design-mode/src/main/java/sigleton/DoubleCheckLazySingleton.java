package sigleton;

/**
 * @Author: ganbo
 * @Date: 2019/11/25 10:55
 */
public class DoubleCheckLazySingleton {

    private static DoubleCheckLazySingleton instance;

    private DoubleCheckLazySingleton() throws Exception {
        System.out.println("���췽��������");
        if (instance != null) {
            throw new Exception("��������������");
        }
    }

    public static DoubleCheckLazySingleton getInstance() throws Exception {

        if (instance == null) {
            synchronized (DoubleCheckLazySingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckLazySingleton();
                }
            }
        }
        return instance;
    }


    public static void main(String[] args) throws Exception {
        final int start = Integer.MAX_VALUE - 100;
        final int end = Integer.MAX_VALUE;

        System.out.println(start + "===============");
        int count = 0;
        for (int i = start; i <= end; i++) {
            count++;
            System.out.println(count + "=============>" + i);

            if (count == 300) return;
        }
    }
}
