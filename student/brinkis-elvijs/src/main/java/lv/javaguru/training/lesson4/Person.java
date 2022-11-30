package lv.javaguru.training.lesson4;

import com.sun.source.tree.BreakTree;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Person {

    private String name;

    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.name = gender;
    }

    public boolean isAdult() {
        if (age > 17) {
            return true;
        }
        return false;
    }

    public boolean isAdultSimplified() {
        return age > 17;
    }

    public void printInfo() {
        System.out.println("Person name : " + name);
        if (age > 17) {
            System.out.println("Person can vote");
        }
        System.out.println("Person is adult");
        if (age > 68) {
            System.out.println("Person is retired");

        }
    }



}








