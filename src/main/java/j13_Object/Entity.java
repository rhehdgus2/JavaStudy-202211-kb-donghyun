package j13_Object;

import lombok.*;
import java.util.Objects;
@NoArgsConstructor
@AllArgsConstructor
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
@Data
public class Entity {
    private String name;
    private int age;
    private Object address;
    public boolean cmp() {
        return this.getClass() == Entity.class;
    }


}