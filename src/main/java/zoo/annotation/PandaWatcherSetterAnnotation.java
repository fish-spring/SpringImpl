package zoo.annotation;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import zoo.animal.Panda;

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
    @Autowired
    public void setPanda(Panda panda) {
        this.panda = panda;
    }
}
