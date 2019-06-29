package com.github.fish56.spring.ioc.lookup;

public class Sheep {
    protected Police getPolice(){
        return null;
    };

    public void callPolice(){
        Police police = getPolice();
        System.out.println("Calling police " + police.getName());
    }
}
