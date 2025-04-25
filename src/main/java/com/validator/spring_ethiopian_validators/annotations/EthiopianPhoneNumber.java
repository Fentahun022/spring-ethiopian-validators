package com.validator.spring_ethiopian_validators.annotations;


import com.validator.spring_ethiopian_validators.validators.EthiopianPhoneNumberValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = EthiopianPhoneNumberValidator.class)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface EthiopianPhoneNumber {
    String message() default "{ethiopian.phone.invalid}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}