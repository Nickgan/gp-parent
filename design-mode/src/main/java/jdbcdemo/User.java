package jdbcdemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import sigleton.HungrySingleton;

import java.io.*;

/**
 * @Author: ganbo
 * @Date: 2019/10/29 16:02
 */

@Data
@AllArgsConstructor
public class User implements Cloneable, Serializable {

    private Long id;
    private String name;

    public User() {
        System.out.println("构造函数被调用.");
    }

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
