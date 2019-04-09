package zoo.animal;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class MachineCow {
    private String head;
    private String leg;
    private String arm;
    private String body;

    public static class Builder{
        private String head;
        private String leg;
        private String arm;
        private String body;

        public void head(String head){};
        public void leg(String leg){};
        public void arm(String arm){};
        public void body(String body){};
        public MachineCow builder(){
            return new MachineCow();
        }
    }
}
