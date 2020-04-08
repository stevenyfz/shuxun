package com.example.task3.user.mapper;

import com.example.task3.user.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Steven
 * @since 2020-03-30
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
