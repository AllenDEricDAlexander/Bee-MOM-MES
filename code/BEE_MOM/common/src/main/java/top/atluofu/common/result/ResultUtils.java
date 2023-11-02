package top.atluofu.common.result;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName: ResultUtils
 * @description: TODO
 * @author: 有罗敷的马同学
 * @datetime: 2023Year-10Month-23Day-16:53
 * @Version: 1.0
 */
@Data
@SuppressWarnings("serial")
public class ResultUtils<T> implements Serializable {
    private Integer status;
    private String message;

    private T data;

    public static <T> ResultUtils<T> success(T res) {
        return new ResultUtils<T>(200, "ok", res);
    }
    public static <T> ResultUtils<T> error(Integer code,T res) {
        return new ResultUtils<T>(code, "ok", res);
    }

    public static <T> ResultUtils<T> result(Integer code, String message, T res) {
        return new ResultUtils<T>(code, message, res);
    }

    private ResultUtils(Integer status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

}
