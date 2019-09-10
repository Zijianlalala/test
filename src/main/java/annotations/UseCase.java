package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UseCase {
    /**
     * 注解元素可用类型
     * 1.所有基本类型
     * 2.String
     * 3.Class
     * 4.enum
     * 5.Annotation
     * 6.以上类型的数组
     * @return
     */
    public int id();
    public String description() default "no description";
}
