package indi.bootis.vtodo.common.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Bootis(yxh1316185617 @ gmail.com)
 * @version 1.0.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BaseResponse<T> {

  private String message;
  private ResultCode code;
  private T data;

}
