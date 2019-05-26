package com.fushanapi.service;
import com.fushanapi.common.utils.DataGrid;
import com.fushanapi.common.utils.PageInfo;
import java.util.Map;

public interface BaseService<T> {
    PageInfo<T> pagedQuery(DataGrid grid);
    PageInfo<T> pagedQueryByCondition(DataGrid grid, Map<String, Object> map);
    int count(Map<String, Object> map);
}
