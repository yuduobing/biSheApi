package com.bishe.service.impl;

import java.util.List;

import com.bishe.dao.CovidMapper;
import com.bishe.entity.Covid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bishe.service.ICovidService;

/**
 * 大屏数据Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-02-26
 */
@Service
public class CovidServiceImpl implements ICovidService 
{
    @Autowired
    private CovidMapper covidMapper;

    /**
     * 查询大屏数据
     * 
     * @param id 大屏数据主键
     * @return 大屏数据
     */
    @Override
    public Covid selectCovidById(Long id)
    {
        return covidMapper.selectCovidById(id);
    }

    /**
     * 查询大屏数据列表
     * 
     * @param covid 大屏数据
     * @return 大屏数据
     */
    @Override
    public List<Covid> selectCovidList(Covid covid)
    {
        return covidMapper.selectCovidList(covid);
    }

    /**
     * 新增大屏数据
     * 
     * @param covid 大屏数据
     * @return 结果
     */
    @Override
    public int insertCovid(Covid covid)
    {
        return covidMapper.insertCovid(covid);
    }

    /**
     * 修改大屏数据
     * 
     * @param covid 大屏数据
     * @return 结果
     */
    @Override
    public int updateCovid(Covid covid)
    {
        return covidMapper.updateCovid(covid);
    }

    /**
     * 批量删除大屏数据
     * 
     * @param ids 需要删除的大屏数据主键
     * @return 结果
     */
    @Override
    public int deleteCovidByIds(Long[] ids)
    {
        return covidMapper.deleteCovidByIds(ids);
    }

    /**
     * 删除大屏数据信息
     * 
     * @param id 大屏数据主键
     * @return 结果
     */
    @Override
    public int deleteCovidById(Long id)
    {
        return covidMapper.deleteCovidById(id);
    }
}
