package com.github.fish56.spring.ioc;

import com.github.fish56.spring.ioc.animal.Panda;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class PandaWatcher {
    private String name;
    private Panda panda;

    public PandaWatcher(String name, Panda panda) {
        this.name = name;
        this.panda = panda;
    }
}
