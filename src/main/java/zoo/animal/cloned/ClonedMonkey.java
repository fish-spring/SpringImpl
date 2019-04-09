package zoo.animal.cloned;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Getter @Setter
@NoArgsConstructor
public class ClonedMonkey {
    private String name;

    @PostConstruct
    public void createMonkey(){
        System.out.println("Me the Monkey King is coming again!!");
    }

    @PreDestroy
    public void destroyMonkey(){
        System.out.println("Me the Monkey King is going!!");
    }
}
