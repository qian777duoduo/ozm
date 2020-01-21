package com.ozm.omy.mapper;

import com.ozm.omy.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("select id,username userName from test_user")
    public List<User> fingUser();
}
