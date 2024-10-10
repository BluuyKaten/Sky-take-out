package com.sky.mapper;

import com.sky.entity.User;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    /**
     * 微信登录
     * @param openid
     * @return
     * */
    @Select("SELECT * FROM user WHERE openid = #{openid}")
    User getByOpenid(String openid);

    /**
     * 插入数据
     * @param user
     * */
    void insert(User user);
}
