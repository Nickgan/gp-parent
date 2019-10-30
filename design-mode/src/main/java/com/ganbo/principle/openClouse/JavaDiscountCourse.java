package com.ganbo.principle.openClouse;

/**
 * @Author: ganbo
 * @Date: 2019/10/29 11:38
 */
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * 0.61;
    }
}
