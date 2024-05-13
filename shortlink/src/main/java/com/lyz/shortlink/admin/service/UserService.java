package com.lyz.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lyz.shortlink.admin.convention.result.Result;
import com.lyz.shortlink.admin.dao.entity.UserDO;
import com.lyz.shortlink.admin.dto.resp.UserRespDTO;

public interface UserService extends IService<UserDO> {
    Result<UserRespDTO> getUserByUsername(String username);
}
