package com.validator.spring_ethiopian_validators.annotations;


import com.validator.spring_ethiopian_validators.validators.EthiopianTINValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = EthiopianTINValidator.class)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface EthiopianTIN {
    String message() default "{ethiopian.tin.invalid}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}