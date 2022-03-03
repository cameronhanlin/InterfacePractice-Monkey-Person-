package com.company;

public class Person implements Danceable{

    private String name;

    public Person(String name){
        this.name = name;

    }

    @Override
    public void startDancing(){
        System.out.println(name+" is starting to dance!");
    }

    @Override
    public void stopDancing(){
        System.out.println(name+" is not dancing anymore!");
    }

    @Override
    public void moveBody(String bodypart, String direction){
        System.out.println("Shake your "+bodypart+" to the "+direction);
    }
}
