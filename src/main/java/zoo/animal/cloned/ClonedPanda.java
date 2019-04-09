package zoo.animal.cloned;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

@Getter @Setter
@NoArgsConstructor
public class ClonedPanda implements InitializingBean, DisposableBean {
    private String name;

    public void afterPropertiesSet() throws Exception {
        System.out.println("Create a Panda");
    }

    public void destroy() throws Exception {
        System.out.println("A Panda is gone");
    }
}
