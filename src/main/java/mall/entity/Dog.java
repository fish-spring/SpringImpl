package mall.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Dog {
    @Value("${dogName}")
    private String name;
    private Integer age;
}
