package com.qc233.xiangyu.DAO;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qc233.xiangyu.Pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDAO extends BaseMapper<User> {

}
