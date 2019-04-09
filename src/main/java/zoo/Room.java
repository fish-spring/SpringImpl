package zoo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import zoo.animal.Panda;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Getter @Setter
@NoArgsConstructor
public class Room {
    private Set<Panda> pandaSet;
    private List<Panda> pandaList;
    private Map<String, Panda> pandaMap;
}