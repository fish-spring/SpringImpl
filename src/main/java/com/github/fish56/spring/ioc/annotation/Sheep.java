package com.github.fish56.spring.ioc.annotation;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

@Getter @Setter
@NoArgsConstructor
@Accessors(chain = true)
public class Sheep {
    private String name;

    @Autowired
    private ApplicationContext context;
}
