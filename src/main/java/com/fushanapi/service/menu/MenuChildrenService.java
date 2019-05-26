package com.fushanapi.service.menu;

import com.fushanapi.model.menu.MenuChildren;
import com.fushanapi.service.BaseService;

import java.util.List;

public interface MenuChildrenService extends BaseService<MenuChildren> {
    List<MenuChildren> queryMenuByParentId(Integer parentId);
    List<MenuChildren> queryList(MenuChildren entity);
    List<MenuChildren> queryListAll();
    int insertSelective(MenuChildren entity);
    int updateByPrimaryKey(MenuChildren entity);
}
