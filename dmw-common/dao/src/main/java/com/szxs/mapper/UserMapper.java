package com.szxs.mapper;

import com.szxs.entity.DmUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    /**
     * 查询所有用户
     *
     */
    List<DmUser> queryUsers();

    /**
     * 登录用户
     *
     */
    DmUser loginUser(DmUser dmUser);
}
