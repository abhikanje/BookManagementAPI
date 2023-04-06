package com.coderabhi.mockpractice;

public class Author {
    private String name;
    private int age;
    private char gender;
    private float ratings;

    public Author() {
    }

    public Author(String name, int age, char gender, float ratings) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.ratings = ratings;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public float getRatings() {
        return ratings;
    }

    public void setRatings(float ratings) {
        this.ratings = ratings;
    }
}
