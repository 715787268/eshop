package com.eshop.mng.vo;


public enum ResponseDateEnum {
    SUCCESS("200","执行成功"),
    ERROR("401","请求非法"),
    ERROR_ARGS("402","请求参数错误"),
    ERROR_TOO_QUICK("500","操作太快了");

    private String code;
    private String msg;

    ResponseDateEnum(String code,  String msg){
        this.code = code;
        this.msg = msg;
    }

    public String getCode(){
        return code;
    }

    public String getMsg(){
        return msg;
    }


    public void setCode(String code){
        this.code = code;
    }

    public void setMsg(String msg){
        this.msg = msg;
    }

}
