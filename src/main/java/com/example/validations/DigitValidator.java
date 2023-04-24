package com.example.validations;

import com.example.annotations.IsDigit;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DigitValidator implements ConstraintValidator<IsDigit, String> {

    @Override
    public void initialize(IsDigit digit) {
    }

    @Override
    public boolean isValid(String str, ConstraintValidatorContext context) {
        if (str == null) {
            return true;
        }
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}