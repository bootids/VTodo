package indi.bootis.vtodo.common.api;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.servlet.http.HttpServletResponse;

/**
 * @author 杨旭晖(yxh1316185617 @ gmail.com)
 * @version 1.0.0
 */
@Getter
@AllArgsConstructor
public enum ResultCode {

  SUCCESS(HttpServletResponse.SC_OK, "Operation is Successful");

  final int code;

  final String msg;
}
