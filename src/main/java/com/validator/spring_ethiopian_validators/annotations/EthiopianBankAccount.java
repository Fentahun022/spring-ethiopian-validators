package com.validator.spring_ethiopian_validators.annotations;

import com.validator.spring_ethiopian_validators.validators.EthiopianBankAccountValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = EthiopianBankAccountValidator.class)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface EthiopianBankAccount {
    String message() default "{ethiopian.bankaccount.invalid}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}