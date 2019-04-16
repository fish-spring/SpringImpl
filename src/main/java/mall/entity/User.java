package mall.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String name;
    private Integer age;

    public void init(){
        System.out.println("user init");
    }
    public void destroy(){
        System.out.println("user destroy");
    }
}
