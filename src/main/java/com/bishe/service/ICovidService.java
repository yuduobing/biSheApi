package com.bishe.service;

import com.bishe.entity.Covid;

import java.util.List;

/**
 * 大屏数据Service接口
 * 
 * @author ruoyi
 * @date 2023-02-26
 */
public interface ICovidService 
{
    /**
     * 查询大屏数据
     * 
     * @param id 大屏数据主键
     * @return 大屏数据
     */
    public Covid selectCovidById(Long id);

    /**
     * 查询大屏数据列表
     * 
     * @param covid 大屏数据
     * @return 大屏数据集合
     */
    public List<Covid> selectCovidList(Covid covid);

    /**
     * 新增大屏数据
     * 
     * @param covid 大屏数据
     * @return 结果
     */
    public int insertCovid(Covid covid);

    /**
     * 修改大屏数据
     * 
     * @param covid 大屏数据
     * @return 结果
     */
    public int updateCovid(Covid covid);

    /**
     * 批量删除大屏数据
     * 
     * @param ids 需要删除的大屏数据主键集合
     * @return 结果
     */
    public int deleteCovidByIds(Long[] ids);

    /**
     * 删除大屏数据信息
     * 
     * @param id 大屏数据主键
     * @return 结果
     */
    public int deleteCovidById(Long id);
}
