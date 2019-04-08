package zoo;

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
