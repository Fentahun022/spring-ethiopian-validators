package com.validator.spring_ethiopian_validators.validators;

import com.validator.spring_ethiopian_validators.annotations.EthiopianPhoneNumber;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Locale;
import java.util.regex.Pattern;

public class EthiopianPhoneNumberValidator implements ConstraintValidator<EthiopianPhoneNumber, String> {

    @Autowired
    private EthiopianValidationMessages messages;

    private static final String ETHIOPIAN_PHONE_PATTERN =
            "^(\\+251|0)(9|7)[0-9]{8}$";

    @Override
    public boolean isValid(String phoneNumber, ConstraintValidatorContext context) {
        if (phoneNumber == null || phoneNumber.isEmpty()) {
            buildCustomValidationMessage(context, "ethiopian.phone.invalid");
            return false;
        }

        String cleanedNumber = phoneNumber.replaceAll("[\\s-]", "");

        if (!Pattern.matches(ETHIOPIAN_PHONE_PATTERN, cleanedNumber)) {
            buildCustomValidationMessage(context, "ethiopian.phone.invalid");
            return false;
        }

        return true;
    }

    private void buildCustomValidationMessage(ConstraintValidatorContext context, String messageKey) {
        context.disableDefaultConstraintViolation();
        context.buildConstraintViolationWithTemplate(
                        messages.getMessage(messageKey, Locale.getDefault()))
                .addConstraintViolation();
    }
}
