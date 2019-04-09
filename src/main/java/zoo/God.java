package zoo;

import lombok.Getter;
import lombok.Setter;
import zoo.animal.MachineCow;
import zoo.animal.Panda;

public class God {
    public Panda createChosenPanda(){
        return new Panda("DaBao", 55.5f);
    }
}
