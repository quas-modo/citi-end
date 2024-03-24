package org.huaqi.datacenter.domain.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author whm
 * @date 2024/1/20 16:49
 */
@Data
@NoArgsConstructor
public class Response<T> {
    /**
     * 返回的状态码
     */
    private Integer code;
    /**
     * 返回的信息提示
     */
    private String message;
    /**
     * 返回的数据
     */
    private T data;

    protected static <T> Response<T> build(T data) {
        Response<T> result = new Response<>();
        if (data != null)
            result.setData(data);
        return result;
    }

    public static <T> Response<T> build(T body, Integer code, String message) {
        Response<T> result = build(body);
        result.setCode(code);
        result.setMessage(message);
        return result;
    }


    public static<T> Response<T> success(){
        return Response.success(null);
    }

    public static<T> Response<T> success(int code, String message){
        return Response.build(null, code, message);
    }

    public static<T> Response<T> success(T data){
        return build(data, 200, "操作成功");
    }

    public static<T> Response<T> success(int code, String message, T data) {
        return build(data, code, message);
    }

    public static<T> Response<T> failed(){
        return Response.failed(null);
    }

    public static<T> Response<T> failed(int code, String message){
        return Response.build(null, code, message);
    }

    public static<T> Response<T> failed(T data){
        return build(data, 999, "操作失败");
    }
}


