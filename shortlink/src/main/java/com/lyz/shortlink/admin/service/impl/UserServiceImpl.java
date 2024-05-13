package com.lyz.shortlink.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyz.shortlink.admin.common.enums.UserErrorCodeEnum;
import com.lyz.shortlink.admin.convention.result.Result;
import com.lyz.shortlink.admin.dao.entity.UserDO;
import com.lyz.shortlink.admin.dao.mapper.UserMapper;
import com.lyz.shortlink.admin.dto.resp.UserRespDTO;
import com.lyz.shortlink.admin.exception.ClientException;
import com.lyz.shortlink.admin.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDO> implements UserService {

    @Override
    public Result<UserRespDTO> getUserByUsername(String username) {
        Result result = new Result();
        result.setCode(UserErrorCodeEnum.USER_NULL.code()).setMessage(UserErrorCodeEnum.USER_NULL.message());
        if (result == null){
            throw new ClientException(UserErrorCodeEnum.USER_NULL);
        }
        return result;
    }
}
