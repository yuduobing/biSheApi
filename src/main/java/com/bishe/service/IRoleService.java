package com.bishe.service;

import com.bishe.entity.Admin;

import java.util.List;


/**
 * 用户表Service接口
 * 
 * @author ruoyi
 * @date 2023-02-27
 */
public interface IRoleService
{
    /**
     * 查询用户表
     * 
     * @param id 用户表主键
     * @return 用户表
     */
    public Admin selectAdminById(Long id);

    /**
     * 查询用户表列表
     * 
     * @param admin 用户表
     * @return 用户表集合
     */
    public List<Admin> selectAdminList(Admin admin);

    /**
     * 新增用户表
     * 
     * @param admin 用户表
     * @return 结果
     */
    public int insertAdmin(Admin admin);

    /**
     * 修改用户表
     * 
     * @param admin 用户表
     * @return 结果
     */
    public int updateAdmin(Admin admin);

    /**
     * 批量删除用户表
     * 
     * @param ids 需要删除的用户表主键集合
     * @return 结果
     */
    public int deleteAdminByIds(Long[] ids);

    /**
     * 删除用户表信息
     * 
     * @param id 用户表主键
     * @return 结果
     */
    public int deleteAdminById(Long id);
}
