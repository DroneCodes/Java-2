package com.company;

public class Patient {

    private String  name;
    private int Age;
    private Eye leftEye;
    private Eye rightEye;
    private Heart heart;
    private Stomach stomach;
    private Skin skin;


    public Patient(String name, int age, Eye leftEye, Eye rightEye, Heart heart, Stomach stomach, Skin skin) {
        this.name = name;
        Age = age;
        this.leftEye = leftEye;
        this.rightEye = rightEye;
        this.heart = heart;
        this.stomach = stomach;
        this.skin = skin;
    }


    public String getName() {
        return name;
    }


    public int getAge() {
        return Age;
    }


    public Eye getLeftEye() {
        return leftEye;
    }


    public Eye getRightEye() {
        return rightEye;
    }

    public Heart getHeart() {
        return heart;
    }


    public Stomach getStomach() {
        return stomach;
    }

    public Skin getSkin() {
        return skin;
    }

}
