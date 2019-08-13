package indi.bootis.vtodo.common.error;

import indi.bootis.vtodo.common.api.BaseResponse;
import indi.bootis.vtodo.common.api.ResultCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

/**
 * @author Bootis(yxh1316185617 @ gmail.com)
 * @version 1.0.0
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionTranslator {

  @ExceptionHandler(value = MethodArgumentNotValidException.class)
  public BaseResponse handleError(MethodArgumentNotValidException ex) {
    List<ObjectError> errors = ex.getBindingResult().getAllErrors();
    StringBuffer errorMsg = new StringBuffer();
    errors.forEach(x -> errorMsg.append(x.getDefaultMessage()).append(";"));
    log.error("---MethodArgumentNotValidException Handler--- ERROR: {}", errorMsg.toString());
    return BaseResponse
        .builder()
        .code(ResultCode.SUCCESS)
        .message(errorMsg.toString())
        .build();
  }

}
