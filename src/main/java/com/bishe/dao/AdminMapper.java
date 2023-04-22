package com.bishe.dao;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bishe.entity.Admin;
import com.bishe.entity.Covid;
import org.springframework.stereotype.Repository;

/**
 * 用户表Mapper接口
 * 
 * @author ruoyi
 * @date 2023-02-27
 */
@Repository
public interface AdminMapper extends BaseMapper<Admin>
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
     * 删除用户表
     * 
     * @param id 用户表主键
     * @return 结果
     */
    public int deleteAdminById(Long id);

    /**
     * 批量删除用户表
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAdminByIds(Long[] ids);
}
