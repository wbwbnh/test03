package com.itheima.pojo;

/**
 * @author ljh
 * @version 1.0
 * @date 2020/9/29 10:07
 * @description 标题
 * @package com.itheima.pojo
 */
public class Person {
    private String name;
    private Integer age;
    private Long id;

    public Person() {
    }

    public Person(String name, Integer age, Long id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
