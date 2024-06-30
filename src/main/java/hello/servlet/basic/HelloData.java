package hello.servlet.basic;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;

@Getter @Setter
public class HelloData {

    private String username;
    private int age;
}
