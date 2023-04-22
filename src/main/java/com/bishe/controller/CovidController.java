package com.bishe.controller;

import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.bishe.common.AjaxResult;
import com.bishe.common.BaseController;
import com.bishe.entity.Covid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bishe.service.ICovidService;



/**
 * 大屏数据Controller
 * 
 * @author ruoyi
 * @date 2023-02-26
 */
@RestController
@RequestMapping("/system/covid")
public class CovidController extends BaseController
{
    @Autowired(required=false)
    private ICovidService covidService;

    String BASEsql="";

    /**
     * 查询大屏数据列表
     */

    @GetMapping("/list")
    public AjaxResult list(Covid covid)
    {
        startPage();
        List<Covid> list = covidService.selectCovidList(covid);

        return success(list);
    }



    /**
     * 获取大屏数据详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {

        return success(covidService.selectCovidById(id));
    }

    @GetMapping(value = "/2")
    public AjaxResult getInfo2()
    {

        JSONObject jsonObject = JSON.parseObject(BASEsql);
        JSONArray error = jsonObject.getJSONArray("errors");
        List<Covid> covids = JSON.parseObject(error.toJSONString(), new TypeReference<List<Covid>>() {
        });
        covids.forEach(value->{
            covidService.insertCovid(value);
        });
        return success();
    }
    /**
     * 新增大屏数据
     */

    @PostMapping
    public AjaxResult add(@RequestBody Covid covid)
    {
        return toAjax(covidService.insertCovid(covid));
    }

    /**
     * 修改大屏数据
     */

    @PutMapping
    public AjaxResult edit(@RequestBody Covid covid)
    {
        return toAjax(covidService.updateCovid(covid));
    }

    /**
     * 删除大屏数据
     */

	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(covidService.deleteCovidByIds(ids));
    }
}
