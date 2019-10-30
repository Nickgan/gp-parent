package factory;

/**
 * @Author: ganbo
 * @Date: 2019/10/30 11:17
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        ICourse iCourse = SimpleFactory.create(JavaCourse.class);
        iCourse.record();
    }
}
