package com.validator.spring_ethiopian_validators.validators;

import com.validator.spring_ethiopian_validators.annotations.EthiopianVehiclePlate;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

public class EthiopianVehiclePlateValidator
        implements ConstraintValidator<EthiopianVehiclePlate, String> {

    private static final String PLATE_PATTERN = "^[1-7]-[A-Z]{2}-[0-9]{1,4}$";

    @Override
    public boolean isValid(String plateNumber, ConstraintValidatorContext context) {
        if (plateNumber == null || plateNumber.isEmpty()) {
            return false;
        }
        return Pattern.matches(PLATE_PATTERN, plateNumber.toUpperCase());
    }
}