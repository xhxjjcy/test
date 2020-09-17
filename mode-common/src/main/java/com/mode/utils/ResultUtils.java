package com.mode.utils;

import com.mode.enums.ResponseMessageCode;
import com.mode.vo.RestResponse;

public class ResultUtils {

    public  static RestResponse setOk(){
        return setOk();
    }

    public  static RestResponse setOk(Object data){
        return setOk(null, data);
    }

    public static RestResponse setError(String msg) {
        RestResponse restResponse = new RestResponse();
        restResponse.setData(null);
        restResponse.setCode(ResponseMessageCode.FAIL.getCode());
        restResponse.setMsg(msg);

        return restResponse;
    }

    private static RestResponse setOk(RestResponse restResponse,Object data) {
        if(restResponse == null) {
            restResponse = new RestResponse();
        }
        restResponse.setData(data);
        restResponse.setMsg("操作成功");
        restResponse.setCode(ResponseMessageCode.SUCCESS.getCode());
        return restResponse;
    }
}
