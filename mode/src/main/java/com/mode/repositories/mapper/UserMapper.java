package com.mode.repositories.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mode.repositories.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
