package com.example.annotations;

import com.example.validations.DigitValidator;

import javax.validation.Constraint;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({FIELD, METHOD})
@Retention(RUNTIME)
@Constraint(validatedBy = DigitValidator.class)
public @interface IsDigit {
    String message() default "Must contain only digits";
}
