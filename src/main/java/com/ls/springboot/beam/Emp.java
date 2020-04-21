package com.ls.springboot.beam;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * description: Emp <br>
 * date: 2020/4/14 20:14 <br>
 * author: liushuai <br>
 * version: 1.0 <br>
 *   @EnableConfigurationProperties({ Emp.class })    启用配置，需要指定启用的配置类
 *  NestedConfigurationProperty   启用配置，需要指定启用的配置类
 */
@Component
//@EnableConfigurationProperties({ Emp.class })
//@ConfigurationProperties(prefix = "emp")
public class Emp {
    /* *
     *    类似于spring框架中使用配置文件中的数据注入方式
     *
     */
    @Value("${emp.lastName}")
    private  String lastName;
    @Value("#{10*2}")
    private  Integer age;
    @Value("8000")
    private Double salary;
    private Boolean boss;
    private Date birthday;
    private Map map;
    private List list;
    @NestedConfigurationProperty
    private Forte forte;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Forte getForte() {
        return forte;
    }

    public void setForte(Forte forte) {
        this.forte = forte;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", boss=" + boss +
                ", birthday=" + birthday +
                ", map=" + map +
                ", list=" + list +
                ", forte=" + forte +
                '}';
    }
}
