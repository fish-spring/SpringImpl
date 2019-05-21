package com.github.fish56.spring.ioc.animal.cloned;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class ClonedSheep {
    private String name;

    public void createSheep(){
        System.out.println("a sheep is cloned...");
        System.out.println("Sheep: who am I ?");
    }

    public void destroySheep(){
        System.out.println("Sheep: You evil human.....");
    }
}
