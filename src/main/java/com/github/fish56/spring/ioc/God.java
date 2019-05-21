package com.github.fish56.spring.ioc;

import com.github.fish56.spring.ioc.animal.Panda;

public class God {
    public Panda createChosenPanda(){
        return new Panda("DaBao", 55.5f);
    }
}
