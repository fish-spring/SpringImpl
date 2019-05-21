package com.github.fish56.spring.ioc.annotation;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import com.github.fish56.spring.ioc.animal.Panda;

/**
 * set方法来实现依赖注入
 */
@NoArgsConstructor
public class PandaWatcherSetterAnnotation {
    private String name;
    private Panda panda;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Panda getPanda() {
        return panda;
    }
    public void setPanda(Panda panda) {
        this.panda = panda;
    }
}
