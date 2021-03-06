package com.fehead.exception;

/**
 * Created by xiaoaxiao on 2019/5/3
 * Description:重复秒杀异常（运行期异常）
 */
public class RepeatKillException extends SeckillException {

    public RepeatKillException(String message) {
        super(message);
    }

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }
}
