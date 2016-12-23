package com.example.admin.myapplication;

/**
 * Created by admin on 2016-12-23.
 */

public class Day16_ListView_SingerItem {

    String name;
    String age;
    public Day16_ListView_SingerItem(){

    }

    public Day16_ListView_SingerItem(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
