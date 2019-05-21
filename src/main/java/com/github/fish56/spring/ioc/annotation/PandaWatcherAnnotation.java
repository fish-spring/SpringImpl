package com.github.fish56.spring.ioc.annotation;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.github.fish56.spring.ioc.animal.Panda;
import org.springframework.beans.factory.annotation.Autowired;

import javax.inject.Inject;

/**
 * 属性注入
 */
@Getter @Setter
@NoArgsConstructor
public class PandaWatcherAnnotation {
    private String name;

    @Autowired
    private Panda panda;

    @Inject
    private Panda panda1;
}
