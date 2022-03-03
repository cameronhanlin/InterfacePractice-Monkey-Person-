package com.company;

public class Monkey implements Danceable{

    private String instrument;
    private String name;

    public Monkey(String instrument, String name){
        this.instrument = instrument;
        this.name = name;
    }

    @Override
    public void startDancing(){
        System.out.println(name+", play your "+instrument+"!");
    }

    @Override
    public void stopDancing(){
        System.out.println(name+", stop playing your "+instrument+"!");
    }

    @Override
    public void moveBody(String bodyPart, String direction){
        System.out.println(name+" swing your "+bodyPart+" to the "+direction);
    }




}
