package factory;

/**
 * @Author: ganbo
 * @Date: 2019/10/30 11:09
 */
public class SimpleFactory {

    public static ICourse create(Class<? extends ICourse> clazz){
        ICourse iCourse = null;
        try {
            iCourse = clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return iCourse;
    }
}
