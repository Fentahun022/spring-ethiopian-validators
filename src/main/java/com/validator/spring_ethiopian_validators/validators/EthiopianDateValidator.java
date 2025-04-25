package com.validator.spring_ethiopian_validators.validators;

import com.validator.spring_ethiopian_validators.annotations.EthiopianDate;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class EthiopianDateValidator
        implements ConstraintValidator<EthiopianDate, String> {

    private String format;

    @Override
    public void initialize(EthiopianDate constraintAnnotation) {
        this.format = constraintAnnotation.format();
    }

    @Override
    public boolean isValid(String date, ConstraintValidatorContext context) {
        if (date == null || date.isEmpty()) {
            return false;
        }

        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
            formatter.parse(date);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
}