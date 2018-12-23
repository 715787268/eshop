package com.eshop.mng.vo;

import lombok.Data;

/**
 * @author 佳琪如梦
 * @create 2018-12-23 15:19
 **/

@Data
public class ResponseData<T> {
    private ResponseDateEnum responseDateEnum;
    private T data;

    public ResponseData(ResponseDateEnum responseDateEnum,T data){
        this.responseDateEnum = responseDateEnum;
        this.data = data;
    }
}
