package com.demo.demo01;

import lombok.Data;

/**
 * 封装：将客观事物封装成抽象的类
 */
@Data
public class Persion {

    private String name;

    private String sex;

    private String age;

    public say() {
        System.out.println();
    }
}
