package com.mode.api;


import com.mode.api.client.ModeFeignClient;
import com.mode.vo.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FeignApi {

    @Autowired
    private ModeFeignClient modeFeignClient;


    @GetMapping("/{id}")
    public RestResponse userById(@PathVariable Integer id){
        return modeFeignClient.userById(id);
    }

    @GetMapping("/user")
    public RestResponse userList(){
        return modeFeignClient.userList();
    }

    @GetMapping("/test")
    public String ts(){
        return "test";
    }
}
