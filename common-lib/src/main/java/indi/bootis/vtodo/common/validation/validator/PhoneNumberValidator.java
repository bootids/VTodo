package indi.bootis.vtodo.common.validation.validator;

import indi.bootis.vtodo.common.validation.PhoneNumber;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author Bootis(yxh1316185617 @ gmail.com)
 * @version 1.0.0
 */
public class PhoneNumberValidator implements ConstraintValidator<PhoneNumber, String> {

  @Override
  public boolean isValid(String value, ConstraintValidatorContext context) {
    return false;
  }
}
