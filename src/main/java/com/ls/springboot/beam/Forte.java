package com.ls.springboot.beam;

/**
 * description: Forte <br>
 * date: 2020/4/14 20:17 <br>
 * author: liushuai <br>
 * version: 1.0 <br>
 *
 */
public class Forte {
    private String name;
    private Integer time;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Forte{" +
                "name='" + name + '\'' +
                ", time=" + time +
                '}';
    }
}
