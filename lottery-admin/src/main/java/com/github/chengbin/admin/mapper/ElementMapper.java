package com.github.chengbin.admin.mapper;

import com.github.chengbin.admin.entity.Element;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ElementMapper extends Mapper<Element> {
    public List<Element> selectAuthorityElementByUserId(@Param("userId") String userId);
    public List<Element> selectAuthorityMenuElementByUserId(@Param("userId") String userId, @Param("menuId") String menuId);
    public List<Element> selectAuthorityElementByClientId(@Param("clientId") String clientId);

}