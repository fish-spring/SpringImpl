package com.github.fish56.spring.ioc.annotation;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import com.github.fish56.spring.ioc.animal.Panda;

/**
 * 通过构造函数实现依赖注入
 *   我们不用做什么额外的事情，Spring自动选择合适的容器来帮我们注入
 */
@Getter @Setter
@NoArgsConstructor
public class PandaWatcherConstructorAnnotation {
    private String name;
    private Panda panda;

    public PandaWatcherConstructorAnnotation(Panda panda){
    }
}
