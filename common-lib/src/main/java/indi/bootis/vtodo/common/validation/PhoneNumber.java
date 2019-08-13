package indi.bootis.vtodo.common.validation;

import indi.bootis.vtodo.common.validation.validator.PhoneNumberValidator;

import javax.validation.Constraint;
import java.lang.annotation.*;

/**
 * @author Bootis(yxh1316185617 @ gmail.com)
 * @version 1.0.0
 */
@Documented
@Constraint(validatedBy = PhoneNumberValidator.class)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface PhoneNumber {

  String message() default "Invalid phone number";

  Class[] groups() default {};

  Class[] payload() default {};

}
