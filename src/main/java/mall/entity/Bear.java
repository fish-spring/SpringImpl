package mall.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Bear{
    private String name;
    private Integer age;

    @PostConstruct
    public void construct(){
        System.out.println("Bear: PostConstruct");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Bear: destroy");
    }
}
