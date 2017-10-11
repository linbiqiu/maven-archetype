package ${package}.api.response;

import com.einwin.framework.model.AppCode;


public class AppResponseData<T>{

    private int code;
    private String msg;
    private T data;

    public AppResponseData() {
    }

    //成功默认码为0
    public static <T>AppResponseData<T> Success(String message, T data) {
        return new AppResponseData<T>(0,message,data);
    }

    public static <T>AppResponseData<T> Success(T data) {
        return new AppResponseData<T>(0,"操作成功",data);
    }


    public static <T>AppResponseData<T> Failure(String message,int code) {
        return new AppResponseData<T>(code,message);
    }

    public static  AppResponseData Failure(AppCode appCode){
        return new AppResponseData(appCode);
    }

    public AppResponseData(int code, String message) {
        this.code = code;
        this.msg = message;
    }

    public AppResponseData(int code, String message, T data) {
        this.code = code;
        this.msg = message;
        this.data = data;
    }

    public AppResponseData(AppCode appCode) {
        this.code = appCode.getCode();
        this.msg = appCode.getMessage();
    }

    public AppResponseData(AppCode appCode, T data) {
        this.code = appCode.getCode();
        this.msg = appCode.getMessage();
        this.data = data;
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return msg;
    }

    public void setMessage(String message) {
        this.msg = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
