package com.bishe.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.bishe.common.BaseController;

/**
 * 大屏数据对象 covid
 *
 * @author ruoyi
 * @date 2023-02-26
 */

public class Covid extends BaseController
{
    private static final long serialVersionUID = 1L;
    @TableId(type = IdType.AUTO)
    /** id
     */
    private Long id;

    /** 省份 */

    private String provinceLabel;

    /** 累计感染 */

    private String confirmedCount;

    /** 累计死亡 */

    private String deadCount;

    /** 累计治愈 */

    private String currentConfirmedCount;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setProvinceLabel(String provinceLabel)
    {
        this.provinceLabel = provinceLabel;
    }

    public String getProvinceLabel()
    {
        return provinceLabel;
    }
    public void setConfirmedCount(String confirmedCount)
    {
        this.confirmedCount = confirmedCount;
    }

    public String getConfirmedCount()
    {
        return confirmedCount;
    }
    public void setDeadCount(String deadCount)
    {
        this.deadCount = deadCount;
    }

    public String getDeadCount()
    {
        return deadCount;
    }
    public void setCurrentConfirmedCount(String currentConfirmedCount)
    {
        this.currentConfirmedCount = currentConfirmedCount;
    }

    public String getCurrentConfirmedCount()
    {
        return currentConfirmedCount;
    }


}
