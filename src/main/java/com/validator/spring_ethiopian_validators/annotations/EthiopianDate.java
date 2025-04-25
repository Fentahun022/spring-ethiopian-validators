package com.validator.spring_ethiopian_validators.annotations;

import com.validator.spring_ethiopian_validators.validators.EthiopianDateValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = EthiopianDateValidator.class)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface EthiopianDate {
    String message() default "{ethiopian.date.invalid}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
    String format() default "dd/MM/yyyy";
}
