package com.fushanapi.service.role;

import com.fushanapi.model.role.RoleInfo;

import java.util.List;
public interface RoleInfoService{
    List<RoleInfo> queryByUserId(Integer id);
    List<RoleInfo> queryListAll();
}
