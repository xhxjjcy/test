package com.mode.api.client;


import com.mode.vo.RestResponse;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Component
@FeignClient(value = "mode",fallback = ModeFallback.class)
public interface ModeFeignClient {

    @GetMapping("user/userList")
    RestResponse userList();

    @GetMapping("user/{id}")
    RestResponse userById(@PathVariable("id") Integer id);


}
