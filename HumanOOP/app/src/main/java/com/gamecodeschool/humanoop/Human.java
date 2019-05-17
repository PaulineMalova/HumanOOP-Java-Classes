package com.gamecodeschool.humanoop;

import android.util.Log;

public class Human {
    public String name;
    public int age;
    public int weight;

    public Human(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void eat() {
        Log.d("Human","I am eating food.");
    }

    public void sleep() {
        Log.d("Human","zzzzzzzzzzzz");
    }

    public void sleep(int hours) {
        Log.d("Human","I am sleeping for "+hours+" hours.");
    }

    public void speak(String speech) {
        Log.d("Human",speech);
    }

    public void birthday() {
        int newAge = this.age + 1;
        Log.d("Human","New age is "+newAge);
    }
}
