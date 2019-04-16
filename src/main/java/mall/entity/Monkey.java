package mall.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Monkey implements InitializingBean, DisposableBean {
    private String name;
    private Integer age;

    public void destroy() throws Exception {
        System.out.println("monkey: after destroy");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("monkey: after propertiesSet");
    }
}
