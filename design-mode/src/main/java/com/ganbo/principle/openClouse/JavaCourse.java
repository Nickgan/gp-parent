package com.ganbo.principle.openClouse;

/**
 * @Author: ganbo
 * @Date: 2019/10/29 11:37
 */
public class JavaCourse implements ICourse {
    private Integer id;
    private String name;
    private Double price;


    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public JavaCourse(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
