package prototype;

import lombok.Data;

/**
 * @Author: ganbo
 * @Date: 2019/11/1 15:58
 */

@Data
public class Person {

    private Long id;
    private String name;


    public static void main(String[] args) {
        Person p1 = new Person();

    }
}
