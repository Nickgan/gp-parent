package sigleton;

import java.io.*;

/**
 * 恶汉式
 *
 * @Date: 2019/10/30 12:51
 */
public class HungrySingleton implements Serializable {
    private static final long serialVersionUID = 4359709211352400083L;

    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
        System.out.println(Thread.currentThread().getName() + "construct invoke =============");
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
    //    private Object readResolve() {
//        return instance;
//    }
    public static void main(String[] args) throws Exception {
//        HungrySingleton s2 = HungrySingleton.getInstance();
//        FileOutputStream fos = new FileOutputStream("SeriableSingleton.obj");
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        oos.writeObject(s2);
//        oos.flush();
//        oos.close();
        FileInputStream fis = new FileInputStream("SeriableSingleton.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object s1 = ois.readObject();
        HungrySingleton s3 = (HungrySingleton) s1;
        ois.close();
//        System.out.println(s1 == s2);

    }
}
