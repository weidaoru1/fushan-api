package com.fushanapi.service.role;

import com.fushanapi.model.role.RoleUser;

public interface RoleUserService {
    int insertSelective(RoleUser entity);
    int deleteByUserId(Integer id);
}
