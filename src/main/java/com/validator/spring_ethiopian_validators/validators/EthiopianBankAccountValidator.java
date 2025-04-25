package com.validator.spring_ethiopian_validators.validators;

import com.validator.spring_ethiopian_validators.annotations.EthiopianBankAccount;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

public class EthiopianBankAccountValidator
        implements ConstraintValidator<EthiopianBankAccount, String> {

    private static final String ACCOUNT_PATTERN = "^[0-9]{9,18}$";

    @Override
    public boolean isValid(String accountNumber, ConstraintValidatorContext context) {
        if (accountNumber == null || accountNumber.isEmpty()) {
            return false;
        }
        return Pattern.matches(ACCOUNT_PATTERN, accountNumber);
    }
}