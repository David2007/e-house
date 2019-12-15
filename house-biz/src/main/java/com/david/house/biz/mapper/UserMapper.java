package com.david.house.biz.mapper;

import com.david.house.common.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    public List<User> selectUsers();
}
