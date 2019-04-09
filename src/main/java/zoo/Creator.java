package zoo;

import zoo.animal.Panda;

public class Creator {
    public static Panda createChosenPanda(){
        return new Panda("DaBao", 55.5f);
    }
}
