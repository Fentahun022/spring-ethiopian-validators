package com.validator.spring_ethiopian_validators.annotations;

import com.validator.spring_ethiopian_validators.validators.EthiopianVehiclePlateValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = EthiopianVehiclePlateValidator.class)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface EthiopianVehiclePlate {
    String message() default "{ethiopian.vehicleplate.invalid}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
