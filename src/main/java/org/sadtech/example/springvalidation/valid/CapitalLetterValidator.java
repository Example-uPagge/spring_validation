package org.sadtech.example.springvalidation.valid;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CapitalLetterValidator implements ConstraintValidator<CapitalLetter, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value != null && !value.isEmpty()) {
            return Character.isUpperCase(value.charAt(0));
        }
        return true;
    }

}
