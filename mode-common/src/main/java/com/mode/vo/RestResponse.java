package com.mode.vo;

import com.mode.enums.ResponseMessageCode;
import lombok.Data;

@Data
public class RestResponse<T> {

    private T data;

    private  String code;

    private String msg;

    public RestResponse() {

    }
    public  RestResponse(ResponseMessageCode resp){
        this.code = resp.getCode();
        this.msg = resp.getMsg();
    }

    public RestResponse(ResponseMessageCode resp,T data){
        this.code = resp.getCode();
        this.msg = resp.getMsg();
        this.data =data;
    }

    public RestResponse(String code, String desc, T data) {
        this.code = code;
        this.msg = desc;
        this.data = data;
    }

    public RestResponse(String code, String desc) {
        this.code = code;
        this.msg = desc;
    }



    public void setResponseMessageCode(ResponseMessageCode resp) {
        this.code = resp.getCode();
        this.msg = resp.getMsg();
    }

    public void setResponseMessageCode(ResponseMessageCode resp, T data) {
        this.code = resp.getCode();
        this.msg = resp.getMsg();
        this.data = data;
    }


}
