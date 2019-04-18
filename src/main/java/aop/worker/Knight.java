package aop.worker;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Knight {
    private String name;

    public void fight(){
        System.out.println(name + " is fighting");
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    public void sleepAllNight(){
        System.out.println(name + " is sleeping");
    }

    public void overWall() throws Exception{
        throw new Exception("404 error");
    }
}