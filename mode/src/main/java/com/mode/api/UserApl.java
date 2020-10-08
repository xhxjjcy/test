package com.mode.api;
import com.mode.service.UserService;
import com.mode.utils.ResultUtils;
import com.mode.vo.RestResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


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
    @GetMapping("/userList")
    public RestResponse userList(){
        return ResultUtils.setOk(userService.userList());
    }

    @GetMapping("/{id}")
    public RestResponse userById(@PathVariable("id") Integer id){
        log.info("2345678901");
        return ResultUtils.setOk(userService.userById(id));
    }


}
