package com.gamecodeschool.humanoop;

import android.util.Log;

public class Anna extends Human {
    public int height;
    public Anna(String name, int age, int weight) {
        super(name, age, weight);
    }

    public Anna(String name, int age, int weight, int height) {
        super(name, age, weight);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void eat() {
        super.eat();
        Log.d("Anna", "New weight is "+ (weight+2));
    }

    public void birthday(){
        int myAge = age + 4;
        Log.d("Anna", "New age is "+myAge);
    }
}
