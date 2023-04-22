package com.bishe.service.impl;

import java.util.List;

import com.bishe.dao.AdminMapper;
import com.bishe.entity.Admin;
import com.bishe.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.bishe.service.IAdminService;

/**
 * 用户表Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-02-27
 */
@Service
public class RoleServiceImpl implements IRoleService
{
    @Autowired
    private AdminMapper adminMapper;

    /**
     * 查询用户表
     * 
     * @param id 用户表主键
     * @return 用户表
     */
    @Override
    public Admin selectAdminById(Long id)
    {
        return adminMapper.selectAdminById(id);
    }

    /**
     * 查询用户表列表
     * 
     * @param admin 用户表
     * @return 用户表
     */
    @Override
    public List<Admin> selectAdminList(Admin admin)
    {
        return adminMapper.selectAdminList(admin);
    }

    /**
     * 新增用户表
     * 
     * @param admin 用户表
     * @return 结果
     */
    @Override
    public int insertAdmin(Admin admin)
    {
        return adminMapper.insertAdmin(admin);
    }

    /**
     * 修改用户表
     * 
     * @param admin 用户表
     * @return 结果
     */
    @Override
    public int updateAdmin(Admin admin)
    {
        return adminMapper.updateAdmin(admin);
    }

    /**
     * 批量删除用户表
     * 
     * @param ids 需要删除的用户表主键
     * @return 结果
     */
    @Override
    public int deleteAdminByIds(Long[] ids)
    {
        return adminMapper.deleteAdminByIds(ids);
    }

    /**
     * 删除用户表信息
     * 
     * @param id 用户表主键
     * @return 结果
     */
    @Override
    public int deleteAdminById(Long id)
    {
        return adminMapper.deleteAdminById(id);
    }
}
