package com.fh.model;

public class ServerResponse {

    private int code;

    private String message;

    private Object data;

    public ServerResponse(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }


    public static ServerResponse success(Object data){
        ResponseEnum responseEnum = ResponseEnum.OK;
        return new ServerResponse(responseEnum.getCode(),responseEnum.getMessage(),data);
    }

    public static ServerResponse success(){
        ResponseEnum responseEnum = ResponseEnum.OK;
        return new ServerResponse(responseEnum.getCode(),responseEnum.getMessage(),null);
    }

    public static ServerResponse error(Object data){
        ResponseEnum responseEnum = ResponseEnum.ERROR;
        return new ServerResponse(responseEnum.getCode(),responseEnum.getMessage(),data);
    }

    public static ServerResponse error(){
        ResponseEnum responseEnum = ResponseEnum.ERROR;
        return new ServerResponse(responseEnum.getCode(),responseEnum.getMessage(),null);
    }

    public static ServerResponse success(ResponseEnum responseEnum){
        return new ServerResponse(responseEnum.getCode(),responseEnum.getMessage(),null);
    }

    public static ServerResponse success(ResponseEnum responseEnum, Object data){
        return new ServerResponse(responseEnum.getCode(),responseEnum.getMessage(),data);
    }

    public static ServerResponse error(ResponseEnum responseEnum){
        return new ServerResponse(responseEnum.getCode(),responseEnum.getMessage(),null);
    }

    public static ServerResponse error(int code, String message){
        return new ServerResponse(code,message,null);
    }



    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public Object getData() {
        return data;
    }
}
