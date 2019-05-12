package com.sda.tallinn6.fundamentals.practical.homework.task19;


public class Dog {
    private String name;
    private int age;
    private String species;

    public Dog(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
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

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void print(){
        System.out.println("Dog name:"+name+" Age:"+age+" Species:"+species);
    }

}
