package assignments.assignment_01.custom_annotations.author;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE,ElementType.METHOD})
public @interface AuthorAnnotation {
    public String authorName() default "";
    public String emailId() default "abc@xyz.com";
    public String employeeType() default "permanent";
}