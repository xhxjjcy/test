package com.mode.api.client;

import com.mode.utils.ResultUtils;
import com.mode.vo.RestResponse;
import org.springframework.stereotype.Component;

@Component
public class ModeFallback implements  ModeFeignClient {
    @Override
    public RestResponse userList() {
        return null;
    }

    @Override
    public RestResponse userById(Integer  id) {
        return ResultUtils.setOk("服务调用失败");
    }
}
