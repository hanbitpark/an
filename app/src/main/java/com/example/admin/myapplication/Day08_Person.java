package com.example.admin.myapplication;

import java.io.Serializable;

/**
 * Created by admin on 2016-12-09.
 */

public class Day08_Person implements Serializable{


    String person;
    int age;

    public Day08_Person() {
    }

    public Day08_Person(String person, int age) {
        this.person = person;
        this.age = age;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
