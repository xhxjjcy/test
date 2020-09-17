package com.mode.api;
import com.mode.service.UserService;
import com.mode.utils.ResultUtils;
import com.mode.vo.RestResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.rmi.runtime.Log;

import java.util.logging.Logger;


@RestController
@RequestMapping("/user")
@Slf4j
public class UserApl {

    @Autowired
    private UserService userService;


    /**
     * 用户列表
     * @return
     */
    @GetMapping("/user")
    public RestResponse userList(){
        log.info("234567890");
        //return ResultUtils.setOk("buibuibui");
        return ResultUtils.setOk(userService.userList());
    }




}
