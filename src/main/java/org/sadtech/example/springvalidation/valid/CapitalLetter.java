package org.sadtech.example.springvalidation.valid;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = CapitalLetterValidator.class)
@Documented
public @interface CapitalLetter {

    String message() default "должно быть с большой буквы";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
