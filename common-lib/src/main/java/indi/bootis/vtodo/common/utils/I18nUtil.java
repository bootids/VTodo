package indi.bootis.vtodo.common.utils;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

import java.util.Locale;

/**
 * @author Bootis(yxh1316185617 @ gmail.com)
 * @version 1.0.0
 */
@Component
public class I18nUtil {

  private final MessageSource messageSource;

  public I18nUtil(MessageSource messageSource) {
    this.messageSource = messageSource;
  }

  public String getMessage(String code) {
    return this.getMessage(code, new Object[]{});
  }

  public String getMessage(String code, String defaultMessage) {
    return this.getMessage(code, null, defaultMessage);
  }

  public String getMessage(String code, String defaultMessage, Locale locale) {
    return this.getMessage(code, null, defaultMessage, locale);
  }

  public String getMessage(String code, Locale locale) {
    return this.getMessage(code, null, "", locale);
  }

  public String getMessage(String code, Object[] args) {
    return this.getMessage(code, args, "");
  }

  public String getMessage(String code, Object[] args, Locale locale) {
    return this.getMessage(code, args, "", locale);
  }

  public String getMessage(String code, Object[] args, String defaultMessage) {
    Locale locale = LocaleContextHolder.getLocale();
    return this.getMessage(code, args, defaultMessage, locale);
  }

  public String getMessage(String code, Object[] args, String defaultMessage, Locale locale) {
    return messageSource.getMessage(code, args, defaultMessage, locale);
  }


}
