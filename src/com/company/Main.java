package com.company;

public class Main {

    public static void main(String[] args) {

        Monkey monkey = new Monkey("Accordian", "Bonzo");
        Person person = new Person("Ronald Reagan");

        monkey.startDancing();
        monkey.moveBody("arm","left");
        monkey.stopDancing();

        person.startDancing();
        person.moveBody("leg","right");
        person.stopDancing();


    }
}
