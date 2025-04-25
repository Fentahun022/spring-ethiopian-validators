package com.validator.spring_ethiopian_validators.validators;

import com.validator.spring_ethiopian_validators.annotations.EthiopianTIN;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

public class EthiopianTINValidator
        implements ConstraintValidator<EthiopianTIN, String> {

    private static final String TIN_PATTERN = "^[0-9]{10}$";

    @Override
    public boolean isValid(String tin, ConstraintValidatorContext context) {
        if (tin == null || tin.isEmpty()) {
            return false;
        }
        return Pattern.matches(TIN_PATTERN, tin);
    }
}